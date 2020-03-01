package chap32;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader; 

public class StringReader {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hanah\\Desktop\\String.txt"))){
		
			String str;
			while(true) {
				str = br.readLine();
				if(str == null)
					break;
				System.out.println(str);
			}
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}
	

}
