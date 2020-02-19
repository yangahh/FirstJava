package chap24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortCollections {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Weapon");
		list = new ArrayList<>(list);
		
		// 정렬 전 출력
		for(String s : list)
			System.out.println(s);
		System.out.println();
		
		// 정렬
		Collections.sort(list);
		/*
		 * sort 메소드
		 * public static <T extends Comparable<? super T>> void sort(List<T> list)
		 * Collections.sort메소드 호출시 list가 List<String>임에 따라 T는 String으로 결정됨
		 * String extends Comparable<? super String> -> String 클래스는 Comparable<String>을 구현하므로 조건 만족.
		 * >> 메소드 호출 가능(=성공) 
		 * */
		
		// 정렬 후 출력
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.println(itr.next());
//		for(String s : list)   // 위 for문과 같은 결과
//			System.out.println(s);
	}

}
