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
	public static void main(String[] args) throws InterruptedException {
		Task2 t1 = new Task2();
		Task2 t2 = new Task2();
		
		t1.start();
		t2.start();
		
		System.out.println("End " + Thread.currentThread().getName());
	}

}


// run()메소드가 하나면 있어도 될 경우에는 다음 코드처럼 main메소드가 있는 클래스에 run()메소드를 넣어도 된다. (extends Thread도 가능)
//public class MakeThreadDemo2 implements Runnable{
//	
//	public void run() {
//		int n1 = 10;
//		int n2 = 20;
//		String name = Thread.currentThread().getName();
//		System.out.println(name + " : " + (n1 + n2));
//	}
//	public static void main(String[] args) throws InterruptedException {
//		Task2 t1 = new Task2();
//		Task2 t2 = new Task2();
//		
//		t1.start();
//		t2.start();
//		
//		System.out.println("End " + Thread.currentThread().getName());
//	}
//
//}