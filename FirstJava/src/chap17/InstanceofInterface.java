//package chap17;
//
//interface Printable{
//	void printLine(String str);
//}
//
//class SimplePrinter implements Printable{
//	public void printLine(String str) { // Printable을 직적 구현
//		System.out.println(str);
//	}
//}
//
//class MultiPrinter extends SimplePrinter{ // Printable을 간접 구현함 
//	public void printLine(String str) {
//		super.printLine("start of multi...");
//		super.printLine(str);
//		super.printLine("end of multi");
//	}
//}
//
//public class InstanceofInterface {
//	public static void main(String[] args) {
//		Printable prn1 = new SimplePrinter();  // 인터페이스를 직접 혹은 간접적으로 구현하는 모든 클래스의 인스턴스를 참조할 수 있다.
//		Printable prn2 = new MultiPrinter();
//		
//		if(prn1 instanceof Printable)  // Printable prn1 = new Printable 가능?
//			prn1.printLine("This is a simple printer"); 
//		System.out.println();
//		
//		if(prn2 instanceof Printable) // 
//			prn2.printLine("This is a multiful printer");
//	}
//
//}
