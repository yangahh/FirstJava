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
		System.out.println("�� : " + model);
		System.out.println("�� �� : " + doors);
		System.out.println("â�� �� : " + windows);
	}
	
	@Override
	void start() {
		System.out.println("�ڵ��� �õ��ɱ�");
	}
	
	@Override
	void drive() {
		System.out.println("���� ����");
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
		System.out.println("������");
	}
	
}

class Truck extends Car {

	public Truck(int wheels, String color, String model, int doors, int windows) {
		super(wheels, color, model, doors, windows);
		// TODO Auto-generated constructor stub
	}
	
}
