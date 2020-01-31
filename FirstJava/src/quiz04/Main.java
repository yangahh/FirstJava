package quiz04;

public class Main {

	public static void main(String[] args) {
				
		Calc calc = new Calc();
		int x = 3;
		int y = 10;
		
		System.out.println("x + y = " + calc.plus(x, y));
		System.out.println("x - y = " + calc.minus(x, y));
		System.out.println("x * y = " + calc.multi(x, y));
		System.out.println("x / y = " + calc.division(x, y));
	}

}
