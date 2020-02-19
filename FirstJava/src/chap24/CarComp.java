package chap24;

import java.util.Comparator;

// 새로운 정렬기준을 만들기 위한 클래스
class CarComp implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		return o2.disp - o1.disp; // 새로운 정렬기준 정의. disp를 기준으로 내림차순 정렬
	}

}
