package quiz05;

public class Main {
	public static void main(String[] args) {
		for(int i = 1; i < 6; i++) {  // 행 나누기
			for (int j = 5; j > i; j--) {  // 공백 채우기
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {  // * 채우기
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
