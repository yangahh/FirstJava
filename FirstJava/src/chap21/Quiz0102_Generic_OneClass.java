package chap21;

class DBox2<L, R>{
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

public class Quiz0102_Generic_OneClass {
	public static void main(String[] args) {
		DBox2<String, Integer> box1 = new DBox2<>();
		box1.set("Apple", 25);
		DBox2<String, Integer> box2 = new DBox2<>();
		box2.set("Orange", 33);
//		System.out.println(box1.lGet() + " & " + box1.rGet());
		
		DBox2<DBox2<String, Integer>, DBox2<String, Integer>> box3 = new DBox2<>();
		box3.set(box1, box2);
		System.out.println(box3);
		
		
	}

}


//class DBox<L, R> {
//    private L left;     // 왼쪽 수납 공간
//    private R right;    // 오른쪽 수납 공간
//
//    public void set(L o, R r) {
//        left = o;
//        right = r;
//    } 
//    
//    @Override
//    public String toString() {
//        return left + " & " +right;
//    }
//}
//
//class Quiz0102_Generic_OneClass {
//    public static void main(String[] args) {
//        DBox<String, Integer> box1 = new DBox<>();
//        box1.set("Apple", 25);
//
//        DBox<String, Integer> box2 = new DBox<>();
//        box2.set("Orange", 33);
//        
//        DBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DBox<>();
//        ddbox.set(box1, box2);
//
//        System.out.println(ddbox);
//    }
//}