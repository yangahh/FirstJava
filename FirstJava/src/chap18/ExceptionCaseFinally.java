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
			writer = Files.newBufferedWriter(file);  // IOException 발생 가능
			writer.write('A');    // IOException 발생 가능
			writer.write('Z');    // IOException 발생 가능
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(writer != null)
				try {
					writer.close();   // IOException 발생 가능 + 반드시 실행시켜야 하는 구문 (resource close)
				} catch (IOException e) {
					e.printStackTrace();
				}  
		}
	}

}
