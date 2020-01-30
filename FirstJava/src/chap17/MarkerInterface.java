package chap17;

interface Upper{};  // Marker Interface. ���� �������
interface Lower{};

interface Printerable{  // �⺻���� interface
	String getContents();
}

class Report implements Printerable, Upper{
	String conts;
	Report(String conts){  // ������
		this.conts = conts;
	}
	@Override
	public String getContents() {  // Printerable �������̽��� getContents �޼ҵ� ����(����)
		return conts;
	}
}

class LowerReport implements Printerable, Lower{
	String conts;
	LowerReport(String conts){  // ������
		this.conts = conts;
	}
	@Override
	public String getContents() {  // Printerable �������̽��� getContents �޼ҵ� ����(����)
		return conts;
	}
}

class NonReport implements Printerable{
	String conts;
	NonReport(String conts){  // ������
		this.conts = conts;
	}
	@Override
	public String getContents() {  // Printerable �������̽��� getContents �޼ҵ� ����(����)
		return conts;
	}
}

class Printer{  // ���ǿ� ���� ���
	public void printContents(Printerable doc) { // Printerable �������̽��� ��/���������� �����ϴ� Ŭ����(���⼭�� Report Ŭ����)�� �ν��Ͻ��� ���ڷ� �����ض�
		if(doc instanceof Upper)  // doc�� �����ϴ� �ν��Ͻ��� Upper �ν��Ͻ��� �����ϴ���
			System.out.println((doc.getContents()).toUpperCase()); // Upper�� ��� ( String.toUpperCase() )
		else if(doc instanceof Lower)  // doc�� �����ϴ� �ν��Ͻ��� Lower �ν��Ͻ��� �����ϴ���
			System.out.println((doc.getContents()).toLowerCase()); // Lower�� ���
		else
			System.out.println(doc.getContents());  // �״�� ���
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
