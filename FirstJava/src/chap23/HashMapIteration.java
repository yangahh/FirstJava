package chap23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIteration {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(45, "Brown");
		map.put(30, "James");
		map.put(20, "Martin");
		map.put(50, "Tom");
		
		// Key만 담고 있는 컬렉션 인스턴스 생성
		Set<Integer> ks = map.keySet();
		// 전체 Key 출력
		for(Integer key : ks)
			System.out.print(key + "\t");  // 정렬 x
		System.out.println();
		// 전체 Value 출력
		for(Integer key : ks)
			System.out.print(map.get(key) + "\t");
		System.out.println();
		
		// Interator를 이용한 Value 출력
//		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();) {
//			System.out.println(map.get(itr.next()));
//		}
		// 위와 같은 결과를 while문을 이용해서 
		Iterator<Integer> itr = ks.iterator();
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}
		
		System.out.println();
		
		
		// key, value 출력
		for(Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ", " + value);
		}
		
	}

}
