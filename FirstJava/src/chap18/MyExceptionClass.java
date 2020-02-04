package chap18;

import java.util.Scanner;

class ReadAgeException extends Exception { // 내가 정의한 예외 클래스
	public ReadAgeException() {
		super("유효하지 않은 나이가 입력되었습니다.");
		
		// 참고
//		 public Exception(String message) {
//		        super(message);
//		    }
//
//		    /**
//		     * Constructs a new exception with the specified detail message and
//		     * cause.  <p>Note that the detail message associated with
//		     * {@code cause} is <i>not</i> automatically incorporated in
//		     * this exception's detail message.
//		     *
//		     * @param  message the detail message (which is saved for later retrieval
//		     *         by the {@link #getMessage()} method).
	}
	
}

public class MyExceptionClass {

	public static void main(String[] args) {
		System.out.println("나이 입력 : ");
		
		try {
			int age = readAge();  // 예외가 발생할 수 있는(넘어올 수 있는) 메소드 호출
			System.out.printf("입력된 나이 : %d \n", age);  // 예외가 발생하면 실행이 안 되야 하는 문장이므로 같이 try 안에 넣어준다
		} catch (ReadAgeException e) {
			e.printStackTrace();
		} 
		
	}
	
	public static int readAge() throws ReadAgeException {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age < 0)  // 유효성 검사
			throw new ReadAgeException(); // 일부러 예외 발생시킴 >> 예외처리 필요(throws ReadAgeException구문)
		
		return age;
	}

}
