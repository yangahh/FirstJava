package chap24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarSortCollections {
	public static void main(String[] args) {
		List<Car> list = new ArrayList<>();
		list.add(new Car(1200));
		list.add(new Car(1000));
		list.add(new Car(3000));
		// 정렬 전 출력
		for (Car c : list)
			System.out.println(c.disp);
		System.out.println();
		// 정렬
		Collections.sort(list);
		
		// 정렬 후 출력
		for (Car c : list)
			System.out.println(c.disp);
	}

}
