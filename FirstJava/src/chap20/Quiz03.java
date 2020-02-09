package chap20;

import java.util.Arrays;

class NameSearch implements Comparable{
	String name;
	int age;
	NameSearch(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		NameSearch s = (NameSearch)o;
		return (this.name.length() - s.name.length());
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		NameSearch[] n = new NameSearch[5];
		n[0] = new NameSearch("dddd",10);
		n[1] = new NameSearch("bb",5);
		n[2] = new NameSearch("eeeee",20);
		n[3] = new NameSearch("ccc",59);
		n[4] = new NameSearch("a",18);
		
		Arrays.sort(n);
		int idx = Arrays.binarySearch(n, new NameSearch("ccc", 30));
		
		System.out.println(idx);
		System.out.println("이름 : " + n[idx].name + ", 나이 : " + n[idx].age);
		
	}

}
