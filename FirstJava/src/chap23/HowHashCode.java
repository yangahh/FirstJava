package chap23;

import java.util.HashSet;

class Car{
	private String model;
	private String color;
	
	public Car(String m, String c) {
		model = m;
		color = c;
	}
	@Override
	public String toString() {
		return (model + " : " + color);
	}
	@Override
	public int hashCode() {  // 분류 1단계
		return ((model.hashCode() + color.hashCode()) / 2);
	}
	@Override
	public boolean equals(Object obj) {  // 분류 2단계
		String m = ((Car)obj).model;
		String c = ((Car)obj).color;
		if(model.equals(m) && color.equals(c)) // equals메소드는 String클래스에 대해 이미 내용을 비교하도록 오버라이딩 되어있으므로 ==를 쓰지 않는다(==는 참조값 비교)
			return true;
		else
			return false;
	}
}

public class HowHashCode {
	public static void main(String[] args) {
		HashSet<Car> set = new HashSet<>();  //HashSet<String> set = new HashSet<>();
		set.add(new Car("HY_MD_301", "RED"));
		set.add(new Car("HY_MD_301", "BLACK"));
		set.add(new Car("HY_MD_302", "RED"));
		set.add(new Car("HY_MD_302", "WHITE"));
		set.add(new Car("HY_MD_301", "BLACK"));
		System.out.println("인스턴스 수 : " + set.size());
		
		for(Car car : set)
			System.out.println(car.toString() + "\t");
		
//		System.out.println(set);
	}

}
