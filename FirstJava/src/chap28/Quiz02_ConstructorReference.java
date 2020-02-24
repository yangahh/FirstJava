package chap28;

import java.util.function.BiFunction;

class Box<T, U>{
	private T id;
	private U con;
	public Box(T i, U c) {
		id = i;
		con = c;
	}
	public void showIt() {
		System.out.println("ID : " + id + ", Contents : " + con);
	}
}

public class Quiz02_ConstructorReference {
	public static void main(String[] args) {
		//채워 넣을 부분, 참조변수 bf의 선언
//		BiFunction<Integer, String, Box<Integer, String>> bf = (n, s) -> new Box<>(n, s); 
		BiFunction<Integer, String, Box<Integer, String>> bf = Box::new; 
		
		Box<Integer, String> b1 = bf.apply(1,"apple");
		Box<Integer, String> b2 = bf.apply(2,"Orange");
		
		b1.showIt();
		b2.showIt();
	}

}
// BiFunction<T, U, R>     R apply(T t, U u)

// 생성자 참조 참고  : http://tcpschool.com/java/java_lambda_reference