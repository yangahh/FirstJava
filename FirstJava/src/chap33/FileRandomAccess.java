package chap33;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileRandomAccess {
	public static void main(String[] args) {
		Path fp = Paths.get("data.dat");
		
		// 버퍼 생성
		ByteBuffer wb = ByteBuffer.allocate(1024);  // 1024바이트 크기의 버퍼 생성
		
		// 버퍼에 데이터 저장 
		wb.putInt(120);
		wb.putInt(240);
		wb.putDouble(0.94);
		wb.putDouble(0.75);
		
		// 하나의 채널 생성(양방향 채널)
		try (FileChannel fc = FileChannel.open(fp, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE)){
			// 파일에 쓰기
			wb.flip(); // 버퍼 모드 변환
			fc.write(wb);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
