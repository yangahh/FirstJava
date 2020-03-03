package chap34;

// 쓰레드 생성하는 다른 방법 : Thread를 상속하는 클래스의 인스턴스 생성

class Task2 extends Thread{
	@Override
	public void run() {
		int n1 = 10;
		int n2 = 20;
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + (n1 + n2));
	}
}

public class MakeThreadDemo2 {
	public static void main(String[] args) {
		Task2 t1 = new Task2();
		Task2 t2 = new Task2();
		
		t1.start();
		t2.start();
		
		System.out.println("End " + Thread.currentThread().getName());
	}

}
