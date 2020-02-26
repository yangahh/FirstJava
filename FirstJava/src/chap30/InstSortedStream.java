package chap30;

import java.util.stream.Stream;

public class InstSortedStream {

	public static void main(String[] args) {
		Stream.of("Box", "Apple", "Robot")
			  .sorted()   // Stream<T>의 메소드. 이미 정의된 기준으로 정렬됨(String은 사전편찬순)
			  .forEach(s -> System.out.println(s));
		System.out.println();

		Stream.of("Box", "Apple", "Buzz")
		.sorted((s1, s2) -> s1.length() - s2.length())   // Stream<T>의 메소드. 새 기준으로 정렬
		.forEach(s -> System.out.println(s));
		System.out.println();
	
	}

}
