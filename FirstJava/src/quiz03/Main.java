package quiz03;

public class Main {

	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j) );    // int 타입과 String 타입을 + 하기 전에 형변환을 하는 것이 좋다 
			}
		}

	}

}
