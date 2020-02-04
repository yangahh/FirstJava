package chap18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionCase3 {

	public static void main(String[] args) throws IOException {  // 또는 md1(); 구문을 try-catch로 처리. 예외처리되면 프로그램 종료
		md1();  // IOExcepion 예외가 발생할 수 있는(넘어올 수 있는) 메소드 호출 >> 예외처리 필요
	
	}
	
	public static void md1() throws IOException{  // 또는 md2(); 구문을 try-catch로 처리
		md2();  // IOExcepion 예외가 발생할 수 있는(넘어올 수 있는) 메소드 호출 >> 예외처리 필요
	}

	public static void md2() {
		Path file = Paths.get("");
		BufferedWriter writer = null;

		try {  // 또는 public static void md2() throws IOException 으로 처리
			writer = Files.newBufferedWriter(file);  // IOException 발생 가능
			writer.write('A');    // IOException 발생 가능
			writer.write('Z');    // IOException 발생 가능
			if(writer != null)
				writer.close();   // IOException 발생 가능 + 반드시 실행시켜야 하는 구문 (resource close)

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
