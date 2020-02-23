package chap27;

import java.util.function.BiConsumer;

class Box<T>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class Quiz04_BiConsumer {
	public static void main(String[] args) {
		BiConsumer<Box<Integer>, Integer> box1 = (box, i) -> box.set(i);
		BiConsumer<Box<Double>, Double> box2 = (box, i) -> box.set(i);
		
		
		Box<Integer> b1 = new Box<>();
		box1.accept(b1, 2);
		System.out.println(b1.get());
		
		Box<Double> b2 = new Box<>();
		box2.accept(b2, 3.5);
		System.out.println(b2.get());
	}

}
