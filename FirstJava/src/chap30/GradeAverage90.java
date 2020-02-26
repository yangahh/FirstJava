package chap30;

import java.util.Arrays;

// GradeAverage.java 파일에 있는 ReportCard 클래스 사용

public class GradeAverage90 {
	public static void main(String[] args) {
		ReportCard[] cards = {
			new ReportCard(90, 90, 90),	
			new ReportCard(100, 20, 80),	
			new ReportCard(90, 30, 50)
		};
		boolean b =  Arrays.stream(cards)
				           .mapToDouble(r -> ((r.getMath()) + r.getKorean() + r.getEnglish()) / 3.0 )
						   .anyMatch(avg -> avg >= 90.0);
		if(b) {
			System.out.println("평균 90점 이상이 한 명 이상 존재");
			boolean b2 = Arrays.stream(cards)
					.mapToDouble(r -> ((r.getMath()) + r.getKorean() + r.getEnglish()) / 3.0)
					.allMatch(avg -> avg >= 90.0);
			if(b2)
				System.out.println("평균 90점 이상이 없음");
			else
				System.out.println("모두 평균이 90점 이상인 것은 아님");
		}
		else
			System.out.println("평균 90점 이상이 존재하지 않음");
	}

}
