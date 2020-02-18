package chap20;

import java.util.Arrays;
/*나이 내림차순으로 정렬*/
class PersonDesc implements Comparable{  
	// Comparable인터페이스는 제네릭이 도입되면서 Comparable<T> 인터페이스로 수정되었지만 지금도 기존 코드와의 호환성 유지를 위해 Comparable인터페이스를 지원하고 있다.
	String name;
	int age;
	
	public PersonDesc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		PersonDesc p = (PersonDesc)o;
		return p.age - this.age; // 오름차순 정렬일 경우엔 return this.age - p.age;
	}
}

public class Quiz0201{
	public static void main(String[] args) {
		PersonDesc[] pd = new PersonDesc[5];
		pd[0] = new PersonDesc("d",10);
		pd[1] = new PersonDesc("d",5);
		pd[2] = new PersonDesc("e",20);
		pd[3] = new PersonDesc("c",59);
		pd[4] = new PersonDesc("a",18);
		
		Arrays.sort(pd);
		for(PersonDesc p : pd) {
			System.out.println("이름 : " + p.name + " , 나이 : " + p.age);
		}
	}
	
	
	

}
