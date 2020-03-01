package chap32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class BytesFileCopier {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("복사 대상 파일 : ");  // C:\Users\hanah\Desktop\Read7FromFile2.java
		String org = sc.nextLine();
		System.out.print("사본 파일 이름 : ");  // C:\Users\hanah\Desktop\Read7FromFile2_cp.java
		String cpy = sc.nextLine();
		
		try (InputStream in = new FileInputStream(org);
				OutputStream out = new FileOutputStream(cpy) ){
			int data;
			while(true) {
				data = in.read();  // 파일로부터 1바이트를 읽어들임
//				System.out.println(data);
				if(data == -1)  // 더 이상 읽어 들일 데이터가 없으면
					break;
				out.write(data);  // 파일에 1바이트를 쓴다.
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
