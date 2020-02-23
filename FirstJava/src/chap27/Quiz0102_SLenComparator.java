package chap27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class SLenComp implements Comparator<String>{
//
//	@Override
//	public int compare(String o1, String o2) {
//		return o1.length() - o2.length();
//	}
//	
//}

public class Quiz0102_SLenComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Robot");
		list.add("Lambda");
		list.add("Box");
		
//		Collections.sort(list, new SLenComp());  // 정렬
		
		/*방법 1*/
//		Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();
//		Collections.sort(list, comp);
		
		/*방법 2*/
		Collections.sort(list, (s1, s2) -> s1.length() - s2.length());
		
		for(String s : list)
			System.out.println(s);
	}

}
