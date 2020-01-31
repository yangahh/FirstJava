package chap18;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("a = ");
			int a = sc.nextInt();  // ���� �Է� -> ���� �߻�
			System.out.print("b = ");
			int b = sc.nextInt();  // ���� �Է� -> ���� �߻�
			System.out.printf("%d / %d = %d \n", a, b, a/b);
		}
		catch(ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
//		catch(InputMismatchException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("End");
	}

}
