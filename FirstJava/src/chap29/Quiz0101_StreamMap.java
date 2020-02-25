package chap29;

import java.util.Arrays;
import java.util.List;

class Box<T>{  // 문자열이 담긴 상자
	private T ob;
	public Box(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class Quiz0101_StreamMap {
	public static void main(String[] args) {
		List<Box<String>> ls = Arrays.asList(new Box<>("Robot"), new Box<>("Toy"), new Box<>("Quiz"));
		// 문제 1) 컬랙션을 기반으로 스트림을 생성하고 이 스트림을 기반으로 문자열 스트림을 생성하는 맵핑 연산자를 진행. 그 결과를 forEach 연산을 통해 출력
//		ls.stream()  // 이 컬랙션을 기반으로 스트림 생성
//		  .map(s -> s.get()) // 상자와 상자 안에 있는 문자열을 맵핑       Function<T, R> apply     String apply (Box<String> t)
//		  .forEach(s -> System.out.println(s));
		
		
		// 문제 2) 이번에는 Box<String>을 Integer로 맵핑. 이때  Integer는 상자에 담긴 문자열의 길이다.
		ls.stream()
		  .map(s -> s.get().length())
		  .forEach(s -> System.out.println(s));
		
	}

}
