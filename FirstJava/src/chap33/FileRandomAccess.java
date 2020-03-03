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
		
		// 순서 : 프로그램(데이터) -> 버퍼1 -> 채널(write) -> 파일
		//      파일 -> 채널(read) -> 버퍼2 -> 프로그램(데이터)
		// 버퍼와 채널은 독립적으로 존재.(1:1이 아님)
		
		// 버퍼 생성
		ByteBuffer wb = ByteBuffer.allocate(1024);  // 1024바이트 크기의 버퍼 생성 (쓰기용 버퍼)
		
		// 버퍼에 데이터 저장 
		System.out.println("---------wb버퍼에 데이터 저장------------");
		wb.putInt(120);
		System.out.println("wb버퍼의 position : " + wb.position()); // 버퍼 포지션 확인
		wb.putInt(240);
		System.out.println("wb버퍼의 position : " + wb.position());
		wb.putDouble(0.94);
		System.out.println("wb버퍼의 position : " + wb.position());
		wb.putDouble(0.75);
		System.out.println("wb버퍼의 position : " + wb.position());
		
		
		// 하나의 채널 생성(양방향 채널)
		try (FileChannel fc = FileChannel.open(fp, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE)){
			
			// 버퍼에 있는 데이터를 파일에 쓰기
			System.out.println("----------wb버퍼 filp------------");
			wb.flip(); // 버퍼의 position 정보를 0으로 바꿔줌
			System.out.println("wb버퍼의 position : " + wb.position());
			System.out.println("----wb버퍼에 있는 내용 파일에 write----");
			fc.write(wb);  // 버퍼에 있는 내용 write(position이 0이니까 120부터 쓴다). 파일에 쓰고 나면 버퍼와 마찬가지로 position이 0->4->8->16->24 순으로 이동(int형은 4byte, double형은 8byte)
			System.out.println("채널의 position : " + fc.position());
			System.out.println();
			
			
			// 파일로부터 읽고 버퍼에 저장
			ByteBuffer rb = ByteBuffer.allocate(1024);  // 버퍼 생성(읽기용)
			System.out.println("--------채널 position 리셋--------");
			fc.position(0);
			System.out.println("채널의 position : " + fc.position());
			System.out.println("--파일로 부터 읽어들인 데이터를 rb버퍼에 파일에 저장--");
			fc.read(rb);
			System.out.println("rb버퍼의 position : " + rb.position());
			System.out.println("채널의 position : " + fc.position());
			System.out.println();
			
			
			// 이하 버퍼로부터 데이터 읽기
			System.out.println("----------rb버퍼 filp------------");
			rb.flip(); // position을 0으로 설정하고 처음에 120부터 읽기 위해
			System.out.println("rb버퍼의 position : " + rb.position());
			System.out.println(rb.getInt());
			System.out.println("rb버퍼의 position : " + rb.position());
			
			rb.position(Integer.BYTES * 2);  // 버퍼의 포지션 이동 
			System.out.println("-------rb버퍼 8바이트 위치로 이동--------");
			System.out.println("rb버퍼의 position : " + rb.position());
			System.out.println(rb.getDouble());
			System.out.println("rb버퍼의 position : " + rb.position());
			System.out.println(rb.getDouble());
			System.out.println("rb버퍼의 position : " + rb.position());
			
			rb.position(Integer.BYTES);
			System.out.println("-------rb버퍼 4바이트 위치로 이동--------");
			System.out.println("rb버퍼의 position : " + rb.position());
			System.out.println(rb.getInt());
			System.out.println("rb버퍼의 position : " + rb.position());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//		System.out.println(Integer.BYTES*2); // == 4
		
	}

}
