package chap18;
import java.util.Scanner;

public class ExceptionCase2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
			System.out.print("a = ");
			int a = sc.nextInt();
			System.out.print("b = ");  // b = 0 을 입력하면
			int b = sc.nextInt();
		try {
			System.out.printf("%d / %d = %d \n", a, b , a/b);   // 예외 발생 지점
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
	
	public synchronized void test() {
		
	}

}
