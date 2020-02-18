package chap20;

import java.util.Arrays;

class NameAgeSearch implements Comparable{
	String name;
	int age;
	NameAgeSearch(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {    // 이름과 나이 기준으로 정렬.
		NameAgeSearch s = (NameAgeSearch)o;
//		int nameX = this.name.compareTo(s.name);
		boolean nameX = this.name.equals(s.name); // 이름이 일치 할 경우 true
		int ageX = (this.age - s.age); // 나이가 일치 할 경우 0
//		if( (nameX == 0) && (ageX == 0))
		if( nameX && (ageX == 0))
			return 0;
		else
			return -1;
		
	}
	@Override
	public String toString() {
		return name + ", " + age ;
	}
}

public class QuizPlus {

	public static void main(String[] args) {
		NameAgeSearch[] n = new NameAgeSearch[5];
		n[0] = new NameAgeSearch("dddd",10);
		n[1] = new NameAgeSearch("bb",5);
		n[2] = new NameAgeSearch("eeeee",20);
		n[3] = new NameAgeSearch("ccc",59);
		n[4] = new NameAgeSearch("a",18);
		
		Arrays.sort(n); // 정렬

		for(NameAgeSearch nas : n) // 정렬 확인
			System.out.println(nas);
		System.out.println();
		
		int idx = Arrays.binarySearch(n, new NameAgeSearch("a", 10));
		
		if (idx >= 0) {
			System.out.println(idx);
			System.out.println("이름 : " + n[idx].name + ", 나이 : " + n[idx].age);
		}
		else {
			System.out.println(idx); // 왜 -6만 나옴??
			System.out.println("조건에 맞는 사람이 없습니다.");
		}
			
		
		
	}

}
