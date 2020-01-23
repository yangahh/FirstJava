package chap11;

public class RetrunStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stb1 = new StringBuilder("123");
		StringBuilder stb2 = stb1.append(45678);
//		System.out.println(stb1.toString());
//		System.out.println(stb2.toString());
		
		if (stb1 == stb2)
			System.out.println("같은 인스턴스 참조");
		else
			System.out.println("다른 인스턴스 참조");
		
	}

}
