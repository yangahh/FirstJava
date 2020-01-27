package chap13;

public class Quiz0202 {

	public static void main(String[] args) {
		int[][] ar = {
				{1 ,2 ,3}, 
				{4, 5, 6},
				{7, 8, 9}
		};
		changeRow(ar);
	}
	public static void changeRow(int[][] arr) {
		int[][] nr = new int[3][3];
//		for(int j = 0; j < nr[1].length; j++) {
//			nr[0][j] = arr[2][j];
//			nr[1][j] = arr[0][j];
//			nr[2][j] = arr[1][j];
//		}
		nr[0] = arr[2];
		nr[1] = arr[0];
		nr[2] = arr[1];
		for(int i = 0; i < nr.length; i++) {
			for(int j = 0; j < nr[i].length; j++) {
				System.out.print(nr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
