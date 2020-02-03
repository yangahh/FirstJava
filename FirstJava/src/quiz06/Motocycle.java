package quiz06;

public class Motocycle extends Vehicle{
	
	int windows;

	public Motocycle(int wheels, String color, int windows) {
		super(wheels, color);
		this.windows = windows;
	}
	
	@Override
	void showInfo() {
		super.showInfo();
		System.out.println("Ã¢¹® ¼ö : " + windows);
	}
	@Override
	void start() {
		System.out.println("Çï¸ä¾²±â");
	}

}
