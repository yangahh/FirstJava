package chap24;

import java.util.Comparator;

public class StrComp implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareToIgnoreCase(s2); // 대소문자 구분 없이 비교
	}
	
}
