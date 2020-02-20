package chap26;

interface Printable{
	void print();
}

class Papers{
	private String con;  // 인스턴스 변수
	public Papers(String s) {  // Papers 클래스 생성자
		con = s;
	}
	
	public Printable getPrinter() {
		return new Printer();  // 인스턴스 메소드. Printable형 반환	
	}
	
	private class Printer implements Printable{ // 멤버 클래스. private 선언으로 외부에서 볼 수 없게 감춤
		@Override
		public void print() {
			System.out.println(con);
		}
	}
	
//	/*로컬 클래스 구현*/
//	public Printable getPrinter() {
//		class Printer implements Printable{ // private 선언은 삭제. 
//			@Override
//			public void print() {
//				System.out.println(con);
//			}
//		}
//		return new Printer();
//	}
//	
	
//	/*익명 클래스 구현*/
//	public Printable getPrinter() {
//		return new Printable() {       // (복잡하니까 return은 뻬놓고 생각..) Printer 클래스의 이름은 사실상 new Printer() 할 때 빼고는 불필요. 
//										    이 메소드가 구현하고 있는 인터페이스로 클래스 이름을 대신하여 인스턴스를 생성할 수 있다.
//			@Override                  // 인터페이스가 가지고 있는 추상메소드는 있어야하므로 덧붙여서 써준다
//			public void print() {
//				System.out.println(con);
//			}
//		};  // 세미콜론!!
//      간단히 정리하면 
//		클래스명 인스턴스명 = new 클래스명();   이거를 클래스명 대신에 인터페이스 명을 쓰고 {}로 이어서 {}안에 인터페이스으 추상 메소드를 쓰면 됨
//	 >> 인터페이스명 인스턴스명 = new 인터페이스명{ 추상메소드 내용 };
//	}
	
}

public class UseMemberInner {
	public static void main(String[] args) {
		Papers p = new Papers ("서류 내용 : 행복합니다");
		Printable prn = p.getPrinter();  // 클래스 사용자 입장에서 Printable 인터페이스는 알지만 Printer 클래스는 모른다. 알 필요도 없다
		prn.print();

	}

}
