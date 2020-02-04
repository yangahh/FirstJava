package chap18;
//ctrl + shift + o >> �ڵ� import
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionCase {

	public static void main(String[] args) {
		Path file = Paths.get("");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);  // IOException �߻� ����
			writer.write('A');    // IOException �߻� ����
			writer.write('Z');    // IOException �߻� ����
			if(writer != null)
				writer.close();   // IOException �߻� ���� + �ݵ�� ������Ѿ� �ϴ� ���� (resource close)
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}
