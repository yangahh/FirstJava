package chap24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("robot");
		list.add("ROBOT");
		list.add("TOY");
		list.add("apple");
		list.add("APPLE");
		
		Collections.sort(list); // 기존 String 정렬 기준으로 정렬 (사전편차순. 대소문자 구별. 대문자 먼저 (A-Z) -> 소문자 (a-z)
		// 기존 정렬 후 출력
		for(String s : list)
			System.out.println(s);
		System.out.println();
		
		StrComp comp = new StrComp(); // 새 정렬 기준 생성
		Collections.sort(list, comp); // 새 기준으로 정렬
		for(String s : list)
			System.out.println(s);
		System.out.println();
		
		int idx = Collections.binarySearch(list, "apple", comp);
		System.out.println("인덱스 위치 : " + idx);
		System.out.println(list.get(idx)); // 결과 idx = 0, get -> APPLE (대소문자 구분을 안하므로)
	}

}
