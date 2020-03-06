package chap34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SyncArrayList {
	public static List<Integer> lst = Collections.synchronizedList(new ArrayList<Integer>()); // 동기화 시킨 컬렉션 인스턴스 생성
	
	public static void main(String[] args) throws InterruptedException {
		for(int i = 1; i < 16; i++) { // 1, 2, 3, ..., 15
			lst.add(i);
		}
		System.out.println(lst);
		
		Runnable task = () -> {
			ListIterator<Integer> itr = lst.listIterator();  // ListIterator는 양방향 이동 가능(List 인터페이스를 구현한 컬렉션(LinkedList, ArrayList)만 사용가능 (여기서는 양방향은 별 의미 없음;;)
			while(itr.hasNext()) {
				itr.set(itr.next() + 1); // set() : Replaces the last element returned by next() or previous() with the specified element
				                         // 값을 꺼내서 1증가시켜서 다시 저장하고 있는 로직
			}
			System.out.println(Thread.currentThread().getName());
		};
		
		// 반복자 인스턴스도 동기화 처리
		Runnable task2 = () -> {
			synchronized(lst) {  // lst를 기반으로 해서 동기화
				ListIterator<Integer> itr = lst.listIterator();
				while(itr.hasNext()) {
					itr.set(itr.next() + 1); 
				}
			}
		};
		
		ExecutorService exr = Executors.newFixedThreadPool(3);  // 두 개 이상의 쓰레드가 동시에 접근하는걸 연출시키기 위해
//		exr.submit(task);  // 2, 3, 4, ..., 16
//		exr.submit(task);  // 3, 4, 5, ..., 17
//		exr.submit(task);  // 4, 5, 6, ..., 18 로 예상했지만.. 원하는대로 결과가 나오지 않음>> 인스턴스 lst를 통한 접근만 동기화가 될 뿐, 반복자로 접근하는 것 까지 동기화가 되는건 아님.
		
		// 반복자도 인스턴스 >> 동기화 처리 해줘야 함.(synchronized block 이용)
		exr.submit(task2);  
		exr.submit(task2);  
		exr.submit(task2);  
		
		exr.shutdown();
		exr.awaitTermination(100, TimeUnit.SECONDS);
		
		System.out.println(lst);
	}

}
