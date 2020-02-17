package chap23;

import java.util.LinkedList;
import java.util.List;

public class EnhancedForCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		// 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		// 저장된 인스턴스 참조값 확인
		for(String str : list)
			System.out.print(str + "\t");
		System.out.println();
		
		list.remove(1); // 인덱스가 1인 인스턴스 ("Box") 삭제
		
		// 삭제 후 결과 확인
		for(String str : list)
			System.out.print(str + "\t");
		System.out.println();
	}

}
