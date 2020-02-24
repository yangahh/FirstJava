package chap28;

import java.util.Optional;

public class OptionalOrElse {
	public static void main(String[] args) {
		Optional<String> os1 = Optional.empty();  // 내용물이 없는(=빈) Optional 인스턴스 생성
//		Optional<String> os2 = Optional.ofNullable(null);  // 위에 empty메소드를 사용해서 만든 인스턴스와 동일
		Optional<String> os2 = Optional.of("Basic");
		
		String s1 = os1.map(s -> s.toString()).orElse("Empty");
		String s2 = os2.map(s -> s.toString()).orElse("Empty");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
