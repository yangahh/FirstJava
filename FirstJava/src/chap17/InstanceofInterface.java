//package chap17;
//
//interface Printable{
//	void printLine(String str);
//}
//
//class SimplePrinter implements Printable{
//	public void printLine(String str) { // Printable�� ���� ����
//		System.out.println(str);
//	}
//}
//
//class MultiPrinter extends SimplePrinter{ // Printable�� ���� ������ 
//	public void printLine(String str) {
//		super.printLine("start of multi...");
//		super.printLine(str);
//		super.printLine("end of multi");
//	}
//}
//
//public class InstanceofInterface {
//	public static void main(String[] args) {
//		Printable prn1 = new SimplePrinter();  // �������̽��� ���� Ȥ�� ���������� �����ϴ� ��� Ŭ������ �ν��Ͻ��� ������ �� �ִ�.
//		Printable prn2 = new MultiPrinter();
//		
//		if(prn1 instanceof Printable)  // Printable prn1 = new Printable ����?
//			prn1.printLine("This is a simple printer"); 
//		System.out.println();
//		
//		if(prn2 instanceof Printable) // 
//			prn2.printLine("This is a multiful printer");
//	}
//
//}
