package chap18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionCaseFinally {

	public static void main(String[] args) {
		Path file = Paths.get("");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);  // IOException �߻� ����
			writer.write('A');    // IOException �߻� ����
			writer.write('Z');    // IOException �߻� ����
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(writer != null)
				try {
					writer.close();   // IOException �߻� ���� + �ݵ�� ������Ѿ� �ϴ� ���� (resource close)
				} catch (IOException e) {
					e.printStackTrace();
				}  
		}
	}

}
