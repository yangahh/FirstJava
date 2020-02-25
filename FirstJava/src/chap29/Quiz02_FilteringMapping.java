package chap29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class ToyPriceInfo{  // 장난감 모델 별 가격 정보
	private String model;  // 모델 명
	private int price;     // 가격
	
	public ToyPriceInfo(String m, int p) {
		model = m;
		price = p;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
}

public class Quiz02_FilteringMapping {
	public static void main(String[] args) {
		List<ToyPriceInfo> list = new ArrayList<>();
		list.add(new ToyPriceInfo("Buzz", 50000));
		list.add(new ToyPriceInfo("Woody", 70000));
		list.add(new ToyPriceInfo("Ellin", 30000));
		
		int sum = list.stream()
				      .filter(p -> p.getPrice() > 40000)
				      .mapToInt(t -> t.getPrice())
				      .sum();
		
		System.out.println(sum);

//		list.stream()
//            .filter(p -> p.getPrice() > 40000)
//            .map(s -> s.getModel())
//		 	.forEach(s -> System.out.println(s));
		
		list.stream()
			.filter(s -> s.getModel().length() > 4)
			.map(t -> t.getModel())
			.forEach(s -> System.out.println(s));
	}
	
	

}
