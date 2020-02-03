package quiz06;

public class Main {

	public static void main(String[] args) {
		Suv suv = new Suv(4, "Black", "Volvo", 4, 4); 
		Vehicle coupe = new Coupe(2, "Red", "Minicoupe", 2, 4);
		Bicycle bike = new Bicycle(2, "Green");
		
		suv.showInfo();
		System.out.println("-----------------");
		coupe.showInfo();
		coupe.start();
//		coupe.coupeDesc(); //¿¡·¯	
		System.out.println("-----------------");
		bike.showInfo();
		bike.start();
		bike.drive();
		
		
	}

}

