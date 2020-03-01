package chap32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile3 {
	public static void main(String[] args) throws IOException {
		try (InputStream in2 = new FileInputStream("data.dat")){
			int dat = in2.read();
			System.out.println(dat);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
