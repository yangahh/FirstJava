package chap27;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Quiz02_Predicate {
	public static <T> void show(Predicate<T> p, List<T> lst) { // Predicate<Integer> p = (Integer n) -> {return n%2 != 0;}
		// 채워 넣을 부분
		for(T list : lst) {
			if(p.test(list))
				System.out.print(list + "\t");
		}
			
	}
	public static void main(String[] args) {
		List<Integer> lst1 = Arrays.asList(1, 3, 8, 10, 11);
		show(n -> n%2 != 0, lst1); // 홀수만 출력
//		show(n -> n%2 == 0, lst1); // 짝수만 출력
		System.out.println();
		List<Double> lst2 = Arrays.asList(-1.2, 3.5, -2.4, 9.5);
		show(n -> n > 0.0, lst2); // 0.0 보다 큰 수만 출력
		
		
	}

}
