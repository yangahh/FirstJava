package chap34;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo2 {
	public static void main(String[] args) {
		Runnable task1 = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (5 + 7));
		};
		Runnable task2 = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (7 - 5));
		};
		
		ExecutorService exr = Executors.newFixedThreadPool(2);  // 쓰레드 2개가 있는 쓰레드 풀 생성
		exr.submit(task1);
		exr.submit(task2);
		
		exr.submit(() -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (5 + 7));
		});  // 반복해서 시킬 작업이 아니라면 이런식으로 submit 메소드의 인자 전달 위치에 람다식을 작성해도 된다.
		
		exr.shutdown();
		
		// 쓰레드 1, 2가 맡는 작업과 쓰레드 1, 2가 작업하는 순서는 실행시킬때마다 달라짐.
	}

}
