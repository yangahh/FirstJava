package chap30;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class ReportCard{
	private int math;
	private int korean;
	private int english;
	
	public ReportCard(int m, int k, int e) {
		math = m;
		korean = k;
		english = e;
	}
	
	public int getMath() {
		return math;
	}
	public int getKorean() {
		return korean;
	}
	public int getEnglish() {
		return english;
	}
}

public class GradeAverage {
	public static void main(String[] args) {
		List<ReportCard> list = new ArrayList<>();
		
		list.add(new ReportCard(80, 70, 70));
		list.add(new ReportCard(10, 20, 30));
		list.add(new ReportCard(50, 60, 100));
		
		IntStream scores = list.stream()
							   .flatMapToInt(r -> IntStream.of(r.getMath(), r.getKorean(), r.getEnglish()));  // 반환 타입이 IntStream인 flatMap메소드
		double average = scores.average().getAsDouble();  //average까지 하면 OptionalDouble형으로 반환됨
		
		System.out.println("평균 : " + average);
		
		
		// 과목별 평군
		double mathAvg = list.stream()
							 .mapToInt(i -> i.getMath())  //map 메소드 사용시 ReportCard형이 반환됨 . 참고) <R> Stream<R> map(Function<? super T, ? extends R> mapper);
						     .average().getAsDouble();
		
		double korAvg = list.stream()
							.mapToInt(i -> i.getKorean())
							.average().getAsDouble();
		
		double engAvg = list.stream()
							.mapToInt(i -> i.getEnglish())
							.average().getAsDouble();
		
		System.out.println("수학 평균 : " + mathAvg);
		System.out.println("국어 평균 : " + korAvg);
		System.out.println("영어 평균 : " + engAvg);
		
		
		
		
	}

}
