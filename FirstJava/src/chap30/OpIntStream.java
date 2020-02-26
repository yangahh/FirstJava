package chap30;

import java.util.stream.IntStream;

public class OpIntStream {
	public static void main(String[] args) {
		// 개수
		long cnt = IntStream.of(1,2,3,4,5)
				  		    .count();
		System.out.println(cnt);
		
		// 평균
		IntStream.of(1 ,2 ,3 ,4 ,5)
				 .average()  // 여기까지 하면 OptionalDouble 타입
				 .ifPresent(avg -> System.out.println(avg));
		
		// 최소
		IntStream.of(1,2,3,4,5)
				 .min()   // 여기까지 하면 OptionalInt 타입
				 .ifPresent(min -> System.out.println(min));
	}

}
