package chap31;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		// 현재 날짜와 시각
		LocalDateTime dt = LocalDateTime.now();
			
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("YYYY-MM-DD, HH:mm:SS");
		
		System.out.println(dt.format(fm1));
		
		//항공편 비교
		LocalDateTime flight1 = LocalDateTime.of(2020, 3, 30, 10, 10);
		LocalDateTime flight2 = LocalDateTime.of(2020, 4, 2, 18, 30);
		LocalDateTime myflight;
		
		if(flight1.isBefore(flight2)) // flight1이 filght2보다 이른시각인가?
			myflight = flight1;
		else
			myflight = flight2;
		
		Period day = Period.between(dt.toLocalDate(), myflight.toLocalDate()); //비행까지 남은 시간(일자 단위)
		Duration time = Duration.between(dt.toLocalTime(), myflight.toLocalTime()); //비행까지 남은 시간(시분초)
		System.out.println("비행까지 남은 시간 : " + day + " " + time);
			
		// 날짜시각(LocalDateTime) 차이를 시각의 관점(시 분 초)에서만 계산한다면
		Duration drTime = Duration.between(dt, myflight);
		System.out.println(drTime); // 결과 : PT759H18M18.37S
	}

}

