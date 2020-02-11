package chap21;

class DBox<L, R>{
	private L left;
	private R right;
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	
	public String toString() {
		return (left + " & " + right);
	}
}

class DDBox<U, D>{
	private U up;
	private D down;
	public void setUD(U u, D d) {
		up = u;
		down = d;
	}
	
//	public String toString() {
//		return (up + "\n" + down);
//	}
	public String toString() {
		return (up.toString() + "\n" + down.toString());
	}
}

public class Quiz01_Generic_Double {
	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);
//		System.out.println(box1);
		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 10);
		
		DDBox<DBox<String, Integer>, DBox<String, Integer>> doubleBox = new DDBox<>();
		doubleBox.setUD(box1, box2);
		System.out.println(doubleBox);
	}

}
