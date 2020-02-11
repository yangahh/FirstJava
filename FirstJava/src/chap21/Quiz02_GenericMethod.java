package chap21;

class Box<T>{
	private T ob;
	public void set(T o) {
		ob =o;
	}
	public T get() {
		return ob;
	}

}


public class Quiz02_GenericMethod {
	// swapBox 메소드 정의 - Box<T> 인스턴스를 인자로 전달받음
	public static <E extends Number> void swapBox(Box<E> box1, Box<E> box2){
		E temp = box1.get(); // temp에 99
		
		box1.set(box2.get()); // box1에 55
		box2.set(temp); // box2에 99
		
	}
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>(); // Box클래스의 T는 Integer로 정해짐
		box1.set(99);
		Box<Integer> box2 = new Box<>();
		box2.set(55);
		System.out.println(box1.get() + " & " + box2.get());
		swapBox(box1, box2);  // 메소드 호출하면서 swqpBox의 E가 Box<Integer>로 정해짐?? 사실상 Box클래스의 인스턴스 생성하면서 T가 Integer로 정해짐으로써 E도 결정된거????
		System.out.println(box1.get() + " & " + box2.get());
		
	}

}
