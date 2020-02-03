package quiz06;

public class Car extends Vehicle {
	
	String model;
	int doors;
	int windows;
	
	public Car(int wheels, String color, String model, int doors, int windows) {
		super(wheels, color);
		this.model = model;
		this.doors = doors;
		this.windows = windows;
	}
	@Override
	void showInfo() {
		super.showInfo();
		System.out.println("모델 : " + model);
		System.out.println("문 수 : " + doors);
		System.out.println("창문 수 : " + windows);
	}
	
	@Override
	void start() {
		System.out.println("자동차 시동걸기");
	}
	
	@Override
	void drive() {
		System.out.println("도로 주행");
	}
	

}

class Suv extends Car {

	public Suv(int wheels, String color, String model, int doors, int windows) {
		super(wheels, color, model, doors, windows);
		// TODO Auto-generated constructor stub
	}
	
}

class Coupe extends Car {

	public Coupe(int wheels, String color, String model, int doors, int windows) {
		super(wheels, color, model, doors, windows);
		// TODO Auto-generated constructor stub
	}
	void coupeDesc() {
		System.out.println("소형차");
	}
	
}

class Truck extends Car {

	public Truck(int wheels, String color, String model, int doors, int windows) {
		super(wheels, color, model, doors, windows);
		// TODO Auto-generated constructor stub
	}
	
}
