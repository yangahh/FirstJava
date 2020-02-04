package chap19;

class INum{
	private int num;
	
	public INum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) { // Object�� �޾ƾ� ��� Ŭ������ �ν��Ͻ��� ���ڷ� ���� �� �ִ�.
		if(this.num == ((INum)obj).num) // obj.num�� �������� ����(num�� INum���ϱ�) >> ���� ����ȯ �ʿ�
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
		
		System.out.println("1. �������� ���� == ���� >> �����ϴ� �ν��Ͻ��� �������� ��");
		
		if(num1 == num3)
			System.out.println("- num1�� num3�� �����ϴ� �ν��Ͻ��� ����.");
		else
			System.out.println("- num1�� num3�� �����ϴ� �ν��Ͻ��� �ٸ���.");
		
		System.out.println();
		
		System.out.println("2. �������̵��� equals�޼ҵ� >> �������� ������ ��");
		
		if(num1.equals(num2))
			System.out.println("- num1, num2�� ������ �����ϴ�.");
		else
			System.out.println("- num1, num2�� ������ �ٸ���.");
		
		if(num1.equals(num3))
			System.out.println("- num1, num3�� ������ �����ϴ�.");
		else
			System.out.println("- num1, num3�� ������ �ٸ���.");
		
	}

}
