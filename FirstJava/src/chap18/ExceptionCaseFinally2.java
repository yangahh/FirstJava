package chap18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// try-with-resource��

public class ExceptionCaseFinally2 {
	
	public static void main(String[] args) {
		Path file = Paths.get(""); // ���� ��� ����
//		BufferedWriter writer = null;
		
		try (BufferedWriter writer = Files.newBufferedWriter(file)){ // ���⼭ ���� ����(= ���� open)
//			writer = Files.newBufferedWriter(file);  // IOException �߻� ����
			writer.write('A');    // IOException �߻� ����
			writer.write('Z');    // IOException �߻� ����
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
//		finally {
//			if(writer != null)
//				try {
//					writer.close();   // IOException �߻� ���� + �ݵ�� ������Ѿ� �ϴ� ���� (resource close)
//				} catch (IOException e) {
//					e.printStackTrace();
//				}  
//		}
	}
}
