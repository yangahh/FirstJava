package chap20;

import java.util.Arrays;

class PersonName implements Comparable{
	String name;
	int age;
	
	public PersonName(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {  //  졍렬의 기준이 이름 길이 순(오름차순)
		PersonName p = (PersonName)o;
		return (this.name.length() - p.name.length());
	}
	
	
	
	
}

public class Quiz0202 {

	public static void main(String[] args) {
		PersonName[] pn = new PersonName[5];
		pn[0] = new PersonName("dddd",10);
		pn[1] = new PersonName("bb",5);
		pn[2] = new PersonName("eeeee",20);
		pn[3] = new PersonName("ccc",59);
		pn[4] = new PersonName("a",18);
		
		Arrays.sort(pn);
		for(PersonName p : pn) {
			System.out.println("이름 : " + p.name + " , 나이 : " + p.age);
		}
	}

}
