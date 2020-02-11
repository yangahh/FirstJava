//package chap21;
//
//class Apple{
//	public String toString() {
//		return "I am an apple.";
//	}
//}
//
//class Orange{
//	public String toString() {
//		return "I am an orange.";
//	}
//}
//
//class Box<T>{
//	private T ob;
//	public void set(T o) {
//		ob = o;
//	}
//	public T get() {
//		return ob;
//	}
//}
//
//public class FruitAndBox2_Generic {
//	public static void main(String[] args) {
//		Box<Apple> aBox = new Box<Apple>();
//		Box<Orange> oBox = new Box<Orange>();
//		
//		System.out.println(aBox.get()); // 결과 : null
//		
//		aBox.set(new Apple());
//		oBox.set(new Orange());
//		
//		System.out.println(aBox.get()); // 결과 : I am an apple.
//		System.out.println(oBox.get());
//		
////		위와 같은 결과
////		Apple ap = aBox.get();  //형변환을 하지 않아도 된다 (제네릭의 특징)
////		Orange or = oBox.get();
////		System.out.println(ap);
////		System.out.println(or);
//		
//	}
//}
