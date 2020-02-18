package chap23;

import java.util.Comparator;
import java.util.TreeSet;

class IntegerComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
	
}

public class Quiz02Comparator {

	public static void main(String[] args) {
//		TreeSet<Integer> tr = new TreeSet<>();  // Integer 클래스에 이미 정의되어 있는 compareTo메소드를 기준으로 정렬 >> 오름차순 정렬
		TreeSet<Integer> tr = new TreeSet<>(new IntegerComparator());
		tr.add(30);
		tr.add(10);
		tr.add(20);
		System.out.println(tr);
	}

}
