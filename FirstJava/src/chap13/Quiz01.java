package chap13;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[5];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
		System.out.println("min value = " + minValue(ar));
		System.out.println("max value = " + maxValue(ar));
	}
	public static int minValue(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		return min;
	}
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for(int e: arr) {
			if (max < e)
				max = e;
		}
		return max;
	}
}
