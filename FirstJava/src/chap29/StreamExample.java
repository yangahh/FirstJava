package chap29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExample {
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5};
		// 학습용 코드
//		IntStream stm1 = Arrays.stream(ar);  // 배열 ar로부터 스트림 생성
//		IntStream stm2 = stm1.filter(n -> n%2 == 1);  // 중간 연산 진행  (filter는 IntStream인터페이스의 추상메소드, Predicate 람다식을 인자로 받음
//		int sum = stm2.sum();  // 최종 연산 진랭
		
		// 실제로는 아래 코드를 쓴다
		int sum = Arrays.stream(ar) // 스트림 생성
						.filter(n -> n%2 ==1) //filter통과
						.sum(); // sum 통과시켜서 그 결과 반환
		System.out.println(sum);
		
		String[] names = {"Yoon", "Lee", "Kim"};
		Arrays.stream(names)   // 스트림 생성
			  .forEach(s -> System.out.println(s)); // 최종 연산 진행
		
		
		double[] ds = {1.1, 2.2, 3.3, 4.4, 5.5};
		Arrays.stream(ds, 1, 4)  // 인덱스 1부터 인덱스 4 이전까지만 스트림으로 생성
			  .forEach(s -> System.out.println(s));
		
		
		// 컬렉션 인스턴스를 대상으로 스트림 생성
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		list.stream()  // 스트림 생성
			.forEach(s -> System.out.println(s));
		
		
		List<String> s1 = new ArrayList<>();
		s1.add("Toy");
		s1.add("Box");
		s1.add("Robot");
		
		s1.stream()  // 스트림 생성
		  .filter(s -> s.length() == 3)  // 필터링
		  .forEach(s -> System.out.println(s));
		
		
		//맵핑
		List<String> ls = Arrays.asList("Robot", "Box", "sample");
		ls.stream()
		  .map(s -> s.length()) // 맵핑(글자 수에 따라 맵핑)   // Stream<R> map(Function<? super T, ? extends R> mapper>   >>>> Function<T, R> { R apply(T t); }
          .forEach(n -> System.out.println(n)); // 맵핑 결과를 출력
	}

}
