package chap34;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Counter3{
	int count = 0;
	ReentrantLock lk = new ReentrantLock();
	public void increment() {
		lk.lock();
		try {
			count++; 
		} finally {
			lk.unlock();
		}
	}
	public void decrement() {
		lk.lock();
		try {
			count--; 
		} finally {
			lk.unlock();
		}
	}
	public int getCount() {
		return count;
	}
}


public class MultualAccessReentrantLock {
	public static Counter3 cnt = new Counter3();
	public static void main(String[] args) throws InterruptedException {
		
		Runnable task1 = () -> {
			for(int i = 0; i < 1000; i++) {
				MultualAccessReentrantLock.cnt.increment();
			}
			System.out.println(Thread.currentThread().getName());
		};
		Runnable task2 = () -> {
			for(int i = 0; i < 1000; i++) {
				MultualAccessReentrantLock.cnt.decrement();
			}
			System.out.println(Thread.currentThread().getName());
		};
		
		ExecutorService exr = Executors.newFixedThreadPool(2);
		exr.submit(task1);
		exr.submit(task2);
		
		exr.shutdown();  // shutdown메소드의 의미는 이미 시작된 task는 실행하고, 새로운 작업은 받지 않겠다는 뜻. shutdown메소드는 종료 명령만 메소드를 바로 빠져나옴. 
						 //	그래서 아래의 awaitTermination()문장이 없으면 실행중인 작업이 종료되지 않더라도 바로 getCount()를 실행한다.
		exr.awaitTermination(10, TimeUnit.SECONDS); // 실행중인 작업이 끝났는지 10초 까지만 기다리고 메소드를 빠져나옴
		System.out.println(cnt.getCount());
		System.out.println("main method end");
	}

}

