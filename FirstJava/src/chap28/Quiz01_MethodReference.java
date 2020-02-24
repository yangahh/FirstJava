package chap28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz01_MethodReference {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("lambda");
		list.add("java");
		
//		Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));  // public interface Comparator<T> { int compare(T o1, T o2); } 구현(새로운 정렬 조건)
		Collections.sort(list, String::compareToIgnoreCase);  // 앞 인자를 메소드가 포함된 인스턴스로, 뒷 인자를 메소드의 전달인자로
		System.out.println(list);
		
	}

}
