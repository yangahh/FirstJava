package quiz05;

public class Main {
	public static void main(String[] args) {
		for(int i = 1; i < 6; i++) {  // �� ������
			for (int j = 5; j > i; j--) {  // ���� ä���
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {  // * ä���
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
