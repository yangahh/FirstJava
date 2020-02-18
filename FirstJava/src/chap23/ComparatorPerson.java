package chap23;

import java.util.Comparator;
import java.util.TreeSet;

class Person2 implements Comparable<Person2>{
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + " : " + age ;
	}
	@Override
	public int compareTo(Person2 p) {
		return this.age - p.age;  // 나이가 적은 사람부터 정렬(오름차순)
	}
}

class PersonComparator implements Comparator<Person2>{
	@Override
	public int compare(Person2 p1, Person2 p2) {
		return p2.age - p1.age;  // 나이가 많은 사람부터 정렬(내림차순)
	}
}

public class ComparatorPerson {

	public static void main(String[] args) {
		TreeSet<Person2> tree = new TreeSet<>(new PersonComparator());
		tree.add(new Person2("YOON", 20));
		tree.add(new Person2("HONG", 20));
		tree.add(new Person2("PARK", 10));
		tree.add(new Person2("KIM", 30));
		
		System.out.println("인스턴스 수 : " + tree.size());
//		for(Person2 p : tree)
//			System.out.println(p);
		System.out.println(tree); // 나이 역순으로 정렬됨 + 나이가 같은 인스턴스가 있으면 중복 저장 안됨
	}

}
