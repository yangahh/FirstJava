package chap06;

public class Quiz04Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 101; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i);
			}
		}	
	}
	
	public static boolean isPrimeNumber(int x) {
		if(x == 1) {
			return false;
		}
		
		for(int i = 2; i < x; i++) {
			if(x % i == 0) {
				return false;
				
			}
		}
		return true;
	}

}
