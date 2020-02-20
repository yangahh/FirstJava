package chap26;

class Outer{
	private int num = 0;
	
	class Member{   // 멤버 클래스
		void add(int n) {
			num += n;   // 외부 클래스의 인스턴스 변수에 직접 접근 가능
		}
		int get() {
			return num;
		}
	}
}

public class MemberInner {
	public static void main(String[] args) {
		Outer o1 = new Outer();
		Outer o2 = new Outer();
		
		// o1 기반으로 인스턴스 생성
		Outer.Member o1m1 = o1.new Member(); // 멤버 클래스의 인스턴스는 외부 클래스의 인스턴스에 종속된다.(=외부 클래스의 인스턴스 없이 존재할 수 없음)
		Outer.Member o1m2 = o1.new Member();
		
		// o2 기반으로 인스턴스 생성
		Outer.Member o2m1 = o2.new Member();
		Outer.Member o2m2 = o2.new Member();
		
		o1m1.add(10);
		System.out.println(o1m1.get()); // 결과 : 10
		
		System.out.println(o1m2.get()); // 결과  : 10
		
		System.out.println(o2m1.get()); // 결과 : 0
		
		o2m2.add(20);
		System.out.println(o2m1.get()); // 결과 : 20
	}

}
