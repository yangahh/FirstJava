package chap19;

class INum{
	private int num;
	
	public INum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) { // Object로 받아야 모든 클래스의 인스턴스를 인자로 받을 수 있다.
		if(this.num == ((INum)obj).num) // obj.num에 접근하지 못함(num은 INum꺼니까) >> 강제 형변환 필요
			return true;
		else 
			return false;
	}
}

public class ObjectEquality {
	public static void main(String[] args) {
		INum num1 = new INum(10);
		INum num2 = new INum(20);
		INum num3 = new INum(10);
		
		System.out.println("1. 참조변수 간의 == 연산 >> 참조하는 인스턴스가 같은지를 비교");
		
		if(num1 == num3)
			System.out.println("- num1과 num3은 참조하는 인스턴스가 같다.");
		else
			System.out.println("- num1과 num3은 참조하는 인스턴스가 다르다.");
		
		System.out.println();
		
		System.out.println("2. 오버라이딩한 equals메소드 >> 참조값의 내용을 비교");
		
		if(num1.equals(num2))
			System.out.println("- num1, num2는 내용이 동일하다.");
		else
			System.out.println("- num1, num2는 내용이 다르다.");
		
		if(num1.equals(num3))
			System.out.println("- num1, num3는 내용이 동일하다.");
		else
			System.out.println("- num1, num3는 내용이 다르다.");
		
	}

}
