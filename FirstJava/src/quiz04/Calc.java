package quiz04;

public class Calc {
	
	public int plus(int x, int y) {
		return x + y ;
	}
	public int minus(int x, int y) {
		if (x > y)
			return x - y;
		else
			return y - x;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public double division(double x, double y) {
		return x / y;
	}
}
