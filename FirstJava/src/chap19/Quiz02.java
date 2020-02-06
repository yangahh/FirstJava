package chap19;

class Business implements Cloneable{ // 클론 할 수 있는 클래스
	private String company;
	private String work;
	public Business(String company, String work) { //생성자
		this.company = company;
		this.work = work;
	}
	public void showBusinessInfo() {
		System.out.println("회사 : " + company);
		System.out.println("업무 : " + work);
	}
	@Override
	public Business clone() throws CloneNotSupportedException {
//		return (Business)super.clone();
		Business copy = (Business)super.clone();
		return copy;
	}
//	public Object clone() throws CloneNotSupportedException {
//	return super.clone();
//	}
}

class PersonalInfo implements Cloneable{ // 클론 할 수 있는 클래스
	private String name;
	private int age;
	private Business bz; // 그냥 참조 변수 (아직 누굴 참조하진 않음)
	
	public PersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}
	
	public void changeInfo(String name, int age, String company, String work) { // 정보 수정
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}
	public void showPersonalInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		bz.showBusinessInfo();
	}
	
//	// 얕은 복사
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
	@Override
//	public Object clone() throws CloneNotSupportedException {
	public PersonalInfo clone() throws CloneNotSupportedException {
		// Object 클래스의 clone 메소드 호출을 통한 복사본 생성
		PersonalInfo copy = (PersonalInfo)super.clone();
		// 깊은 복사
		copy.bz = bz.clone(); //bz의 복사본 만들어서 참조하게 만듦
		
		return copy;
	}
	
}


public class Quiz02 {
	public static void main(String[] args) {
		PersonalInfo orgPerson = new PersonalInfo("양", 25, "비디", "DB");
		PersonalInfo cpyPerson;
		
		try {
			cpyPerson = (PersonalInfo)orgPerson.clone();
			orgPerson.changeInfo("양양", 27, "삼성", "개발자");
			orgPerson.showPersonalInfo();
			System.out.println();
			cpyPerson.showPersonalInfo();
			cpyPerson.changeInfo("양한아", 27, "sds", "developer");
			System.out.println();
			cpyPerson.showPersonalInfo();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
	}
}