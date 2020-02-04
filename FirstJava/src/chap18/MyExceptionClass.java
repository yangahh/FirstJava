package chap18;

import java.util.Scanner;

class ReadAgeException extends Exception { // ���� ������ ���� Ŭ����
	public ReadAgeException() {
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");
		
		// ����
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
		System.out.println("���� �Է� : ");
		
		try {
			int age = readAge();  // ���ܰ� �߻��� �� �ִ�(�Ѿ�� �� �ִ�) �޼ҵ� ȣ��
			System.out.printf("�Էµ� ���� : %d \n", age);  // ���ܰ� �߻��ϸ� ������ �� �Ǿ� �ϴ� �����̹Ƿ� ���� try �ȿ� �־��ش�
		} catch (ReadAgeException e) {
			e.printStackTrace();
		} 
		
	}
	
	public static int readAge() throws ReadAgeException {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age < 0)  // ��ȿ�� �˻�
			throw new ReadAgeException(); // �Ϻη� ���� �߻���Ŵ >> ����ó�� �ʿ�(throws ReadAgeException����)
		
		return age;
	}

}
