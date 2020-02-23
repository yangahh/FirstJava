package chap27;

interface Calculate<T>{
	T cal (T a, T b);
}

public class Quiz0101_Lambda {
	public static <T> void calAndShow(Calculate<T> op, T n1, T n2) {
		T r = op.cal(n1, n2);
		System.out.println(r);
	}
	
	public static void main(String[] args) {
//		Calculate<Integer> c1 = (a, b) -> a + b ;
//		calAndShow(c1, 3, 4);
//		
//		Calculate<Double> c2 = (a, b) -> a + b ;
//		calAndShow(c2, 2.5, 7.1);
//		
//		Calculate<Integer> c3 = (a, b) -> a - b ;
//		calAndShow(c3, 4, 2);
//
//		Calculate<Double> c4 = (a, b) -> a - b ;
//		calAndShow(c4, 4.9, 3.2);
		
		
		calAndShow((a, b) -> a + b, 3, 4);  // Calculate<T> op = (a, b) -> a + b;  ,  T는 3과 4때문에 Integer로 정해짐. 단 둘 중 하나라도 소수접이 있으면 컴파일 오류남
		calAndShow((a, b) -> a + b, 2.5, 7.1);	
		calAndShow((a, b) -> a - b, 4, 2);
		calAndShow((a, b) -> a - b, 4.9, 3.2);
		
	}

}
