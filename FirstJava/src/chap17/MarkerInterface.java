package chap17;

interface Upper{};  // Marker Interface. 안이 비어있음
interface Lower{};

interface Printerable{  // 기본적인 interface
	String getContents();
}

class Report implements Printerable, Upper{
	String conts;
	Report(String conts){  // 생성자
		this.conts = conts;
	}
	@Override
	public String getContents() {  // Printerable 인터페이스의 getContents 메소드 구현(정의)
		return conts;
	}
}

class LowerReport implements Printerable, Lower{
	String conts;
	LowerReport(String conts){  // 생성자
		this.conts = conts;
	}
	@Override
	public String getContents() {  // Printerable 인터페이스의 getContents 메소드 구현(정의)
		return conts;
	}
}

class NonReport implements Printerable{
	String conts;
	NonReport(String conts){  // 생성자
		this.conts = conts;
	}
	@Override
	public String getContents() {  // Printerable 인터페이스의 getContents 메소드 구현(정의)
		return conts;
	}
}

class Printer{  // 조건에 따라 출력
	public void printContents(Printerable doc) { // Printerable 인터페이스를 직/간접적으로 구현하는 클래스(여기서는 Report 클래스)의 인스턴스를 인자로 전달해라
		if(doc instanceof Upper)  // doc가 참조하는 인스턴스가 Upper 인스턴스를 구현하는지
			System.out.println((doc.getContents()).toUpperCase()); // Upper로 출력 ( String.toUpperCase() )
		else if(doc instanceof Lower)  // doc가 참조하는 인스턴스가 Lower 인스턴스를 구현하는지
			System.out.println((doc.getContents()).toLowerCase()); // Lower로 출력
		else
			System.out.println(doc.getContents());  // 그대로 출력
	}
}

public class MarkerInterface {
	public static void main(String[] args) {
		Printer prn = new Printer();
		Report doc = new Report("Upper test");
		LowerReport low = new LowerReport("Lower Test");
		NonReport non = new NonReport("test TEST");
		
		prn.printContents(doc);
		System.out.println();
		prn.printContents(low);
		System.out.println();
		prn.printContents(non);
	}

}
