package chap20;

import java.util.Arrays;

class NameSearch implements Comparable{
	String name;
	int age;
	NameSearch(String name, int age){
		this.name = name;
		this.age = age;
	}
//	@Override
//	public int compareTo(Object o) {  
//		NameSearch s = (NameSearch)o;
//		return (this.name.length() - s.name.length());
//	}
	@Override
    public int compareTo(Object o) {
		NameSearch p = (NameSearch)o;
//		System.out.println(this.name + ", " + p.name + "\t" + this.name.compareTo(p.name));
        return this.name.compareTo(p.name); // String 클래스에 정의되어 있는 compareTo메소드는 사전편차순으로 정렬되어 있다.
    }
}

public class Quiz03 {

	public static void main(String[] args) {
		NameSearch[] n = new NameSearch[6];
		n[0] = new NameSearch("dddd",10);
		n[1] = new NameSearch("bb",5);
		n[2] = new NameSearch("eeeee",20);
		n[3] = new NameSearch("ccc",59);
		n[4] = new NameSearch("a",18);
		n[5] = new NameSearch("aaa",18);
		
		
		Arrays.sort(n);
		System.out.println();
		// 정렬 후 확인
		for(NameSearch ns : n)
			System.out.println("이름 : " + ns.name + ", 나이 : " + ns.age);
		System.out.println();
		
		// 이름이 ccc인 배열 인스턴스가 있는지 탐색. 있으면 index값 반환. 없으면 0보다 작은 수 반환
		int idx = Arrays.binarySearch(n, new NameSearch("ccc", 30));
		
		System.out.println(idx);
		System.out.println("이름 : " + n[idx].name + ", 나이 : " + n[idx].age);
		
	}

}
