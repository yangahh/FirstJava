package chap22;

public class Quiz02BoundedWildcardGeneric {
	
	// box에 con과 동일한 내용물이 들었는지 확인
	public static <T> boolean compBox(Box<? extends T> box, T con) {
		T bc = box.get(); // Integer bc = box.get() >> bc에 24가 들어감
//		box.set(con);  // 프로그래머의 실수로 삽입된 문장, 때문에 내용물이 바뀐다 >> set메소드 호출시 컴파일 오류가 나게 수정해야함 >> 매개변수를 'Box<T> box'에서 'Box<? extends T> box'로 수정
		return bc.equals(con);
	}
	public static void main(String[] args) {
		 Box<Integer> box1 = new Box<>();
		 box1.set(24); // Integer box1 = 24;
		 Box<String> box2 = new Box<>();
		 box2.set("Poly"); // String box2 = "Poly";
		 
		 if(compBox(box1, 25)) {  // 24로 바꾸면 아래 구문 실행됨
			 System.out.println("상자 안에 25 저장");
		 }
		 if(compBox(box2, "Moly")) { // "Poly"로 바꾸면 아래 구문 실행됨 ( equals 메소드로 비교했기 때문에 참조값이 아닌 내용물을 비교)
			 System.out.println("상자 안에 Moly 저장");
		 }
		 
		 System.out.println(box1.get());
		 System.out.println(box2.get());
	}

}
