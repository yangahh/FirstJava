package chap26;

interface Printable2{
	void print(String a);
}

public class Lambda4 {
	public static void ShowString(Printable2 p, String s) {
		p.print(s);
	}
	
	public static void main(String[] args) {
		ShowString((s) -> {System.out.println(s);}, "What is Lambda?");
	}

}
