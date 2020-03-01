package chap32;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {
	public static void main(String[] args) {
		String ks = "한글한글한글한글~~~~~";
		String en = "engengengeng~~~~~~";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\hanah\\Desktop\\String.txt")) ){
			bw.write(ks, 0, ks.length());
			bw.newLine();  // 줄 바꿈 문자를 삽입.
			bw.write(en, 0, en.length());
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
