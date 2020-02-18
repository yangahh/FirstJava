package chap23;

import java.util.HashSet;
//import java.util.Objects;

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return (name + "(" + age + ")");
	}
	@Override
	public int hashCode() {
		return (name.hashCode() + age % 5) ; // int에는 hashCode 메소드가 없음. hashCode메소드는 사용자 마음대로 정의 (분류가 되는 값으로만 return해주면 됨)
		
		/*Objects.hash 사용하기 (문제2)*/
//		return Objects.hash(name, age);
	}
	@Override
	public boolean equals(Object obj) {
		String n = ((Person)obj).name;
		int a = ((Person)obj).age;
		
		if(this.name.equals(n) && this.age==a)
			return true;
		else
			return false;
	}
	
}

public class Quiz0101HashCodeEqualsOverride {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("가나다", 20));
		set.add(new Person("가나다", 30));
		set.add(new Person("나다라", 20));
		set.add(new Person("나다라", 30));
		set.add(new Person("가나다", 20));  // 중복
		System.out.println("인스턴스 수 : " + set.size());
		
//		for(Person p : set)
//			System.out.println(p);
		System.out.println(set);
	}
}
