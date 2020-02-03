package quiz06;

public class Vehicle {  //상위 클래스
	
	int wheels;
	String color;
	
	public Vehicle(int wheels, String color) {
		this.wheels = wheels;
		this.color = color;
	}
	
	void showInfo() {
		System.out.println("바퀴 수 : " + wheels);
		System.out.println("색 : " + color);
	}
	
	void start() {
		System.out.println("시동걸기");
	}
	
	void drive() {
		System.out.println("주행");
	}
}
