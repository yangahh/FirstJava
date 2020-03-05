package chap34;

class Counter2{
	int count = 0;
	public void increment() {
		synchronized(this) {
			count++; 
		}
	}
	public void decrement() {
		synchronized (this) {
			count--; 
		}
	}
	public int getCount() {
		return count;
	}
}


// 람다식이 아닌 일반 코드 사용
class Task3 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			MultualAccessSyncBlock.cnt.increment();
		}
	}
}

class Task4 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			MultualAccessSyncBlock.cnt.decrement();
		}
	}
}

public class MultualAccessSyncBlock {
	public static Counter2 cnt = new Counter2();
	public static void main(String[] args) throws InterruptedException {
		
		Task3 task3 = new Task3();
		Task4 task4 = new Task4();
		Thread t1 = new Thread(task3);
		Thread t2 = new Thread(task4);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	
		System.out.println(cnt.getCount());
		System.out.println("main method end");
	}

}
