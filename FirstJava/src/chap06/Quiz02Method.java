package chap06;

public class Quiz02Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		
		System.out.println(minus(a, b));
	}
	
	public static int minus(int x, int y) {
		if ( x > y ) {
			return x - y;
		}
		else {
			return y - x;
		}
			
	}

}
