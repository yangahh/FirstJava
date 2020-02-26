package chap30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOfStream {
	public static void main(String[] args) {
		Stream.of(11, 22, 33, 44)
			  .forEach(n -> System.out.println(n));
		System.out.println();
		
		Stream.of("a", "b", "c")
			  .forEach(s -> System.out.println(s));
		System.out.println();
		
		List<String> ls = Arrays.asList("q","w","e");
		ls.stream()
		  .forEach(s -> System.out.println(s));
		
		Stream.of(ls)
			  .forEach(s -> System.out.println(s)); // 결과 : [q, w, e]
	}
}
