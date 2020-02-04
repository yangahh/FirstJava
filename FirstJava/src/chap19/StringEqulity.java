package chap19;

public class StringEqulity {

	public static void main(String[] args) {
		String str1 = new String("So Simple");
		String str2 = new String("So Simple");
		
		System.out.println("1. ==연산자로 비교");
		if(str1 == str2)
			System.out.println("str1, str2는 참조 대상이 동일하다.");
		else
			System.out.println("str1, str2는 참조 대상이 다르다.");
	
		System.out.println("\n2. equals 메소드로 비교");
		if(str1.equals(str2))  // String 클래스의  equals 메소드
			System.out.println("str1, str2는 내용이 같다.");
		else
			System.out.println("str1, str2는 내용이 다르다.");
	}

}

// String 클래스의 equals 메소드
//public boolean equals(Object anObject) {
//    if (this == anObject) {
//        return true;
//    }
//    if (anObject instanceof String) {  //anObject가 String으로 형변환 가능?
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

