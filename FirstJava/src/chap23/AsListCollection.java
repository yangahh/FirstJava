package chap23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AsListCollection {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box"); //asList 메소드를 통해 컬렉션 인스턴스 생성(초기값 세팅). 하지만 immutable 인스턴스
		list = new ArrayList<>(list); // 생성자를 통해 새로 ArrayList 인스턴스를 만들어서 list 재정의. 생성자 호출 인자로 list를 넘겼기 때문에 기존 list에 있는 내용이 그대로 복사되어 새로 만들어진 list에 저장됨
		/* 참고
		 * ArrayList 클래스의 생성자
		 *  public ArrayList(Collection<? extends E> c) {...}
		 * */
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) {  // for(String s : list) 와 같은 문장
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		
		
		// "Box" 인 인스턴스 삭제
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) {
			if(itr.next().equals("Box")) {
				itr.remove();
			}
		}
		
		// 삭제 후 확인
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
	}

}
