package chap06;

public class Quiz01Method {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
				
		System.out.println(a + " + " + b + " = " + plus(a,b));
		System.out.println(a + " - " + b + " = " + minus(a,b));
		System.out.println(a + " * " + b + " = " + multi(a,b));
		System.out.println(a + " / " + b + " = " + division(a,b));
		
	
		
		
	}
	public static int plus(int x, int y) {
		return x + y;
	}
	public static int minus(int x, int y) {
		return x - y;
	}
	public static int multi(int x, int y) {
		return x * y;
	}
	public static double division(double x, double y) {
		return x / y;
	}
}
