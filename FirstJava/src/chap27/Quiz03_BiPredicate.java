package chap27;

import java.util.function.BiPredicate;

public class Quiz03_BiPredicate {
	public static void main(String[] args) {
		BiPredicate<String, Integer> conv = (s, i) -> {
			if(s.length() > i)
				return true;
			else
				return false;
		};
		
		// test 호출 결과 문자열 "Robot"의 길이가 3을 넘으면 true 반환
		if(conv.test("Robot", 3))
			System.out.println("문자열 길이 3초과");
		else
			System.out.println("문자열 길이 3이하");

		// test 호출 결과 문자열 "Box"의 길이가 5을 넘으면 true 반환
		if(conv.test("Box", 5))
			System.out.println("문자열 길이 5초과");
		else
			System.out.println("문자열 길이 5이하");
		
	}

}
