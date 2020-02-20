package chap26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*기존 방법 (main 메소드에서 이 클래스의 인스턴스 생성하는 것 까지 세트)*/
class StrComp implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
}

public class AnonymousComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbbbb");
		list.add("cccc");
		
		/*기존 방법 (위 StrComp 클래스 까지 세트)*/
		StrComp comp1 = new StrComp();
		
		/*익명 클래스 방식으로 구현*/
		Comparator<String> comp2 = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};
		
//		Collections.sort(list,  comp1);
		Collections.sort(list,  comp2);
		System.out.println(list);
		
		
		
		
		
	}

}
