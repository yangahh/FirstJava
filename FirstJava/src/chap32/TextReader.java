package chap32;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class TextReader {
	public static void main(String[] args) {
		// 미리 만든 C:\Users\hanah\Desktop\sample.txt 파일가지고 실행
		Scanner sc = new Scanner(System.in);
		System.out.print("읽을 파일 : ");
		String src = sc.nextLine();
		
		try (Reader in = new FileReader(src)){
			int ch;
			while(true) {
				ch = in.read();  // 문자를 하나 씩 읽는다.
				if(ch == -1)
					break;
				System.out.print((char)ch);  // 문자를 하나 씩 출력
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
