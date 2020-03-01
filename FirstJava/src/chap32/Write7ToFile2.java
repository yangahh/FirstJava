package chap32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile2 {
	public static void main(String[] args) throws IOException {
		OutputStream out = null;
		
		try {
			out = new FileOutputStream("data.dat");  
			out.write(7);
		}
		finally {
			if(out != null)
				out.close();   // 스트림 생성에 성공했을 시 반드시 리소스를 close해야하고, 스트림 생성에 실패시 close를 안해야 한다.
		}

	}

}
