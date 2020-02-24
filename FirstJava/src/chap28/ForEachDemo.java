package chap28;

import java.util.Arrays;
import java.util.List;
//import java.util.Objects;
//import java.util.function.Consumer;

public class ForEachDemo {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Box", "Robot");
		ls.forEach(s -> System.out.println(s));  // 람다식 기반. *s 는 ls가 가지고 있는 데이터.("Box"와 "Robot"). 컬렉션 인스턴스가 가지고있는 데이터들을 하나씩 람다식에 적용.
		ls.forEach(System.out::println); // 메소드 참조 기반
	}

}



/*
 * default void forEach(Consumer<? super T> action) { // Iterable<T>의 디폴트 메소드
 * (Collection 인터페이스를 상속)
 * 
 * for (T t : this) { // this는 이 메소드가 속한 컬렉션 인스턴스를 의미 (this = 이 인스턴스)
 * action.accept(t); // 모든 저장된 데이터들에 대해 이 문장을 반복 } }
 */

