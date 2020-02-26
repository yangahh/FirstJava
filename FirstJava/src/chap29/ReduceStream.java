package chap29;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceStream {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
		
		BinaryOperator<String> lc = (s1, s2) -> {  // BinaryOperator는 인터페이스
			if(s1.length() > s2.length())
				return s1;
			else
				return s2;
		};
		
		String str = ls.parallelStream() // 병렬 처리를 위한 스트림 생성
					   .reduce("", lc);  // 스트림이 비어있을 경우 "" 반환. 이런 값은 신중히 결정해야함. 왜냐하면 이 값이 스트림 0번째에 들어가 다른 스트림 데이터와 함께 비교대상이 되기 때문.
		System.out.println(str);
	}

}
