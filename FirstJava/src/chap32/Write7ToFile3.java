package chap32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile3 {
	public static void main(String[] args) {
		try (OutputStream out = new FileOutputStream("data.dat")){  // 스트림 생성 성공/실패 시 리소스를 close하는게 알아서 되도록 하는 try-with-resources 기반의 예외처리 기법
			out.write(77);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
