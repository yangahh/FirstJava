package chap19;

public class StringEqulity {

	public static void main(String[] args) {
		String str1 = new String("So Simple");
		String str2 = new String("So Simple");
		
		System.out.println("1. ==�����ڷ� ��");
		if(str1 == str2)
			System.out.println("str1, str2�� ���� ����� �����ϴ�.");
		else
			System.out.println("str1, str2�� ���� ����� �ٸ���.");
	
		System.out.println("\n2. equals �޼ҵ�� ��");
		if(str1.equals(str2))  // String Ŭ������  equals �޼ҵ�
			System.out.println("str1, str2�� ������ ����.");
		else
			System.out.println("str1, str2�� ������ �ٸ���.");
	}

}

// String Ŭ������ equals �޼ҵ�
//public boolean equals(Object anObject) {
//    if (this == anObject) {
//        return true;
//    }
//    if (anObject instanceof String) {  //anObject�� String���� ����ȯ ����?
//        String anotherString = (String)anObject;
//        int n = value.length;
//        if (n == anotherString.value.length) {
//            char v1[] = value;
//            char v2[] = anotherString.value;
//            int i = 0;
//            while (n-- != 0) {
//                if (v1[i] != v2[i])
//                    return false;
//                i++;
//            }
//            return true;
//        }
//    }
//    return false;
//}

