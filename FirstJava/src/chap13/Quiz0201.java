package chap13;

public class Quiz0201 {

	public static void addOneDArr(int[] arr, int add) {
		for(int i =0; i < arr.length; i++) { //가로
			arr[i] += add;
		}
	}
	public static void addTwoDArr(int[][] arr, int add) {
		// addOneDArr 메소드 호출
		for(int i = 0; i < arr.length; i++) { //세로
			addOneDArr(arr[i], add);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int[][] ar = new int[3][4];
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				ar[i][j] = num;
				num++;
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		addTwoDArr(ar, 1);
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) 
				System.out.print(ar[i][j] + " ");
			System.out.println();
		}
	}
}
