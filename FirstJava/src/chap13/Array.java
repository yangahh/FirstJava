package chap13;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String ar0 = "Java";
//		String ar1 = "System";
//		String ar2 = "Compiler";
//		String ar3 = "Park";
//		String ar4 = "Tree";
//		String ar5 = "Dinner";
//		String ar6 = "Brunch Cafe";
//		
//		int cum = 0;
//		
//		cum = ar0.length() + ar1.length() + ar2.length();
		String[] ar = new String[7];
		ar[0] = "Java";
		ar[1] = "System";
		ar[2] = "Compiler";
		ar[3] = "Park";
		ar[4] = "Tree";
		ar[5] = "Dinner";
		ar[6] = "Brunch Cafe";
		int cum = 0;
		
		for(int i = 0 ; i < ar.length; i++)
			cum += ar[i].length();
		
		System.out.println(cum);
		
	}

}
