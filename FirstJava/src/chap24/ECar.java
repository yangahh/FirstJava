package chap24;

class ECar extends Car{ // Car 클래스를 상속 
	int battery;  // 배터리
	public ECar(int d, int b) {
		super(d);  // 상위 클래스인 Car클래스의 생성자 호출 (하위 클래스 생성자 호출시 무조건 실행됨(하위 클래스 생성자보다 먼저)
		battery = b;
	} 
	
	@Override
	public String toString() {
		return "cc(배기량) : " + disp + ", battery : " + battery ;
	}
}
