package chap06;

public class Quiz04Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 2; i < 101; i++) {
			isPreNumber(i);
		}
	}
	
	public static void isPreNumber(int num) {
		int count = 0;
		for (int j = 2; j < num; j++){
			if (num % j == 0) {
				count ++;
			}
		}
		if (count == 0) {
			System.out.println(num);
		}
	}

}
