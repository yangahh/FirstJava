package chap34;

// 람다식이 아닌 일반 코드
class Task implements Runnable{

	@Override
	public void run() {
		int n1 = 10;
		int n2 = 20;
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + (n1 + n2));
	}
	
}

public class MakeThreadDemo {

	public static void main(String[] args) {
		
		// 람다식을 이용한 코드
//		Runnable task = () -> {
//			int n1 = 10;
//			int n2 = 20;
//			String name = Thread.currentThread().getName();
//			System.out.println(name + " : " + (n1 + n2));
//		};// Runnable 인터페이스(추상메소드가 하나인 함수형 인터페이스이다)의 추상메소드 run() 내용 >> 쓰레드가 수행할 작업을 정의
//		
//		Thread t1 = new Thread(task); // 쓰레드 인스턴스 생성(쓰레드가 생성되었다는건 아니고, 재료 준비가 되었다는 뜻)
		
		Task task = new Task();
		Thread t1 = new Thread(task);
		t1.start(); // 쓰레드 생성 및 실행
		System.out.println("End " + Thread.currentThread().getName());
	}

}
