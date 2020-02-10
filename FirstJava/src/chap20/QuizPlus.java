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
	public int compareTo(Object o) {
		NameAgeSearch s = (NameAgeSearch)o;
		boolean nameX = this.name.equals(s.name);
		int ageX = (this.age - s.age);
		if( nameX && (ageX == 0))
			return 0;
		else
			return ageX;
		
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
		
		Arrays.sort(n);
		int idx = Arrays.binarySearch(n, new NameAgeSearch("ccc", 60));
		
		System.out.println(idx);
		System.out.println("이름 : " + n[idx].name + ", 나이 : " + n[idx].age);
	}

}
