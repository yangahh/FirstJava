package chap32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class BufferedFileCopier {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("복사 대상 파일 : ");  // C:\Users\hanah\Desktop\Read7FromFile2.java
		String org = sc.nextLine();
		System.out.print("사본 파일 이름 : ");  // C:\Users\hanah\Desktop\Read7FromFile2_cp.java
		String cpy = sc.nextLine();
		
		try (InputStream in = new FileInputStream(org);
				OutputStream out = new FileOutputStream(cpy) ){

//			int data;
//			while(true) {
//				data = in.read();  // 파일로부터 1바이트를 읽어들임
//				if(data == -1)  // 더 이상 읽어 들일 데이터가 없으면
//					break;
//				out.write(data);  // 파일에 1바이트를 쓴다.
//			}
			byte buf[] = new byte[1024];  // 1024바이트 짜리 버퍼 생성(빈 배열)
			int len;
			
			while(true) {
				len = in.read(buf); // 한 번에 버퍼 단위 (1024바이트)씩 채움(=읽어들임)
//				System.out.println(len);
				if(len == -1)
					break;
				out.write(buf, 0, len);  // len 바이트만큼 데이터를 저장한다.(버퍼 단위로). buf로 전달된 배열의 데이터를 인덱스 0에서부터 len 바이트 만큼 파일에 저장.
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
