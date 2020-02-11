//package chap21;
//
//import java.util.List;
//
//class Apple2{
//	public String toString() {
//		return "I am an apple";
//	}
//}
//
//class Orange2{
//	public String toString() {
//		return "I am an orange";
//	}
//}
//
//class Box2<T>{
//	private T ob;
//	public void set(T o) {
//		ob = o;
//	}
//	public T get() {
//		return ob;
//	}
//}
//
//public class FruitAndBoxFault_Generic {
//
//	public static void main(String[] args) {
//		Box2<Apple2> aBox = new Box2<Apple2>();
//		Box2<Orange2> oBox = new Box2<Orange2>();
//		
////		aBox.set("Apple"); // aBox의 set 메소드는 Apple형을 인자로 받는다. 따라서 문자열인 "Apple"을 쓰면 컴파일 오류
////		oBox.set("Orange");
//		
//		System.out.println(aBox.get()); // 결과 : null (넣은게 없으니까)
//		
////		List<Integer> num = new ArrayList<>(); //List는 인터페이스 ArrayList는 클래스
//	}
//
//}
