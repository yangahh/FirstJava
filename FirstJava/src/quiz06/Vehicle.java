package quiz06;

public class Vehicle {  //���� Ŭ����
	
	int wheels;
	String color;
	
	public Vehicle(int wheels, String color) {
		this.wheels = wheels;
		this.color = color;
	}
	
	void showInfo() {
		System.out.println("���� �� : " + wheels);
		System.out.println("�� : " + color);
	}
	
	void start() {
		System.out.println("�õ��ɱ�");
	}
	
	void drive() {
		System.out.println("����");
	}
}
