package chap24;

class Car implements Comparable<Car> {
	int disp;  //배기량
	public Car(int d) {
		disp = d;
	}
	@Override
	public int compareTo(Car o) {
		return disp - o.disp;  // disp 오름차순으로 정렬
	}
	
}
