package chap24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CarComparator {
	public static void main(String[] args) {
		List<Car> clist = new ArrayList<>();
		clist.add(new Car(1200));
		clist.add(new Car(900));
		clist.add(new Car(3000));
		
		List<ECar> elist = new ArrayList<>();
		elist.add(new ECar(2000, 55));
		elist.add(new ECar(1000, 100));
		elist.add(new ECar(1800, 70));
		
		
		System.out.println("<정렬 전>---------------------------");
		for(Iterator<Car> itr = clist.iterator(); itr.hasNext();)
			System.out.println("cc(배기량) : " + itr.next().disp);
		System.out.println();
		
		// 이거 왜 에러?ㅜㅜ 
//		for(Iterator<ECar> itr = elist.iterator(); itr.hasNext();)
//			System.out.println("cc(배기량) : " + itr.next().disp + ", battery : " + itr.next().battery);		
		// 위 처럼 반복자를 한 번 얻은 후에 itr.next()를 한 번 쓰면  순서가 그 다음으로 넘어감. >> [Error]java.util.NoSuchElementException
		// 따라서 반복자를 사용한 for문을 사용하려면 아래처럼 사용하자(ECar 클래스에 toString메소드 오버라이딩해서 itr.next()를 한 번 만 쓸 수 있게끔
		for(Iterator<ECar> itr = elist.iterator(); itr.hasNext();)
			System.out.println(itr.next().toString());		
//		for(ECar e : elist)  // 위 for문과 동일한 결과
//			System.out.println("cc(배기량) : " + e.disp + ", battery : " + e.battery);
		System.out.println();
		
		CarComp comp = new CarComp(); // 새로운 정렬 기준 생성
		
		// 새로운 기준으로 정렬 (disp 내림차순 기준)
		Collections.sort(clist, comp);
		Collections.sort(elist, comp);
		
		System.out.println("<정렬 후>---------------------------");
		for(Iterator<Car> itr = clist.iterator(); itr.hasNext();)
			System.out.println("cc(배기량) : " + itr.next().disp);
		System.out.println();
		
		for(Iterator<ECar> itr = elist.iterator(); itr.hasNext();)
			System.out.println(itr.next().toString());	
		
//		for(ECar e : elist)
//			System.out.println("cc(배기량) : " + e.disp + ", battery : " + e.battery);
		
	}

}
