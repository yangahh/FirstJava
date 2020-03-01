package chap32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedStream {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("복사 대상 파일 : ");  // C:\Users\hanah\Desktop\Read7FromFile2.java
		String org = sc.nextLine();
		System.out.print("사본 파일 이름 : ");  // C:\Users\hanah\Desktop\Read7FromFile2_cp.java
		String cpy = sc.nextLine();
		
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(org));  // 버퍼 입력 스트림 연결
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(cpy)) ){   // 버퍼 출력 스트림 연결

			int data;
			while(true) {
				data = in.read();
				if(data == -1)  // 더 이상 읽어 들일 데이터가 없으면
					break;
				out.write(data);
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
