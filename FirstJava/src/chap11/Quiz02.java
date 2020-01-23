package chap11;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder personalId = new StringBuilder("990925-1012999");
//		StringBuilder modifyId = personalId.replace(6, 7, " ");
//		
//		System.out.println(modifyId.toString());
		personalId.replace(6, 7, " ");
		System.out.println(personalId.toString());
	}

}
