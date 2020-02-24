package chap28;

import java.util.Optional;

public class OptionalMap {
	public static void main(String[] args) {
		Optional<String> os1 = Optional.of("Optional String"); // Optional String이라는 내용물이 든 Optional 인스턴스 생성
		Optional<String> os2 = os1.map(s -> s.toUpperCase()); // map 메소드가 하는 일 >> 1. 내용물을 꺼냄   2. 꺼낸 내용물에 람다식 적용   3. 람다식 결과를 Optional<>형 인스턴스에 담아서 반환
		System.out.println(os2.get());
		
		Optional<String> os3 = os1.map(s -> s.replace(' ', '_'))
								  .map(s -> s.toLowerCase()); 
		System.out.println(os3.get());
	}

}
