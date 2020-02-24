package chap25;

enum Type{
	// 상수("연결할 문자")
	WAKLING("워킹화"), RUNNING("러닝화"), TRACKING("트래킹화"), HIKING("등산화");  // 끝에 세미콜론 붙여야함
	
	final private String name;
	private Type(String name) { // enum의 생성자 (무조건 private으로 생성됨)
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class PracticeEnum {
	public static void main(String[] args) {
		for(Type type : Type.values())
			System.out.println(type.getName());
	}

}

// https://www.opentutorials.org/module/1226/8025 참고