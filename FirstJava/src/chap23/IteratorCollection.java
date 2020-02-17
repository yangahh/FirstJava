package chap23;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		Iterator<String> itr = list.iterator(); // 반복자 처음 획득
		
		while(itr.hasNext()) {  // 반복자를 이용한 순차적 참조
			String str = itr.next();
			System.out.print(str + "\t");
		}
		System.out.println();
		
		itr = list.iterator(); // 반복자 다시 획득
		
		String str2;
		while(itr.hasNext()) {  // "box"를 가진 인스턴스 삭제
			 str2 = itr.next();
			if(str2.equals("Box")) {
				itr.remove();
			}
		}
		
		itr = list.iterator(); //반복자 다시 획득
		
		while(itr.hasNext()) {
			String str3 = itr.next();
			System.out.print(str3 + "\t");
		}
		System.out.println();
	}
		

}
