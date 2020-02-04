package chap18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionCase3 {

	public static void main(String[] args) throws IOException {  // �Ǵ� md1(); ������ try-catch�� ó��. ����ó���Ǹ� ���α׷� ����
		md1();  // IOExcepion ���ܰ� �߻��� �� �ִ�(�Ѿ�� �� �ִ�) �޼ҵ� ȣ�� >> ����ó�� �ʿ�
	
	}
	
	public static void md1() throws IOException{  // �Ǵ� md2(); ������ try-catch�� ó��
		md2();  // IOExcepion ���ܰ� �߻��� �� �ִ�(�Ѿ�� �� �ִ�) �޼ҵ� ȣ�� >> ����ó�� �ʿ�
	}

	public static void md2() {
		Path file = Paths.get("");
		BufferedWriter writer = null;

		try {  // �Ǵ� public static void md2() throws IOException ���� ó��
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
