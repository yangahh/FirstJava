package chap32;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDataOutputStream {
	public static void main(String[] args) {
		try (DataOutputStream out = 
				new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("data.dat"))) ){
			out.writeInt(370);
			out.writeDouble(3.14);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
