package chap06;

public class Quiz03Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double r = 5;
		System.out.println("원의 둘레 : " + round(2.5));
		System.out.println("원의 넓이 : " + area(2.5));
		
		
	}
	
	public static double round(double x) {
		return 2 * x * 3.14;
	}
	public static double area(double x) {
		return x * x * 3.14;
	}

}
