package chap10;

public class Accumulator {
	
	static int sum = 0;
		
	public static void add(int i) {
		sum += i;
	}
	
	public static void showResult() {
		System.out.println("sum = "+ sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++)
			Accumulator.add(i);
		Accumulator.showResult();
		
	}
}
//static ����/�޼ҵ常�� ���� Ŭ���������� �����ڰ� ��� ��