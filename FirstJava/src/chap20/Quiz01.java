package chap20;

import java.util.Random;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A : ");
		int A = sc.nextInt();
		System.out.print("Z : ");
		int Z = sc.nextInt();
		
		int x;
		if (A > Z)
			x = A - Z;
		else
			x = Z - A;
		
//		String a = sc.next();
//		String b = sc.next();
		
//		char ca = a.charAt(0);
//		char cb = b.charAt(0);
		
//		System.out.println(ca);
//		System.out.println(cb);
		Random rnum = new Random();
//		System.out.println(rnum.nextInt(ca) + cb);
		
		
		System.out.println( A + "와 " + Z +" 사이의 랜덤 수 : " + (rnum.nextInt(A) + x));
		
//		String afaa = "aa";
//		
//		if(afaa.equals("aa")) {
//			
//		}
//		
//		if("aa".equals(afaa)) {
//			
//		}
		
	}

}
