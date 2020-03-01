package chap32;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TextWriter {
	public static void main(String[] args) {
		try (Writer out = new FileWriter("C:\\Users\\hanah\\Desktop\\data.dat")){   // 문자 출력 스트림 생성
			for(int ch = (int)'A'; ch < (int)'Z' + 1; ch++)
				out.write(ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
