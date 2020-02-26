package chap30;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapStream {  // flatMap - 1:*로 맵핑해주는 메소드
	public static void main(String[] args) {
		Stream<String> ss1 = Stream.of("MY_PAGE", "YOUR_LIFE"); 
		
		Stream<String> ss2 = ss1.flatMap(s -> Arrays.stream(s.split("_")));  // flatMap은 반드시 스트림타입으로 반환!!
		
		ss2.forEach(s -> System.out.println(s));
				
	}

}
