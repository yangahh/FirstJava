package quiz06;

public class Bicycle extends Vehicle{

	public Bicycle(int wheels, String color) {
		super(wheels, color);
	}
	
	@Override
	void drive() {
		System.out.println("자전거 도로로 주행");
	}
	

}
