package chap31;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();  // HH:mm:ss.sss형식
		System.out.println("지금 시각 : " + now);
		
		LocalTime mt = now.plusHours(2);
		mt = mt.plusMinutes(20);
		
		System.out.println("지금부터 2시간 20분 후 : " + mt);
		
		LocalTime start = LocalTime.of(10, 5, 58);
		LocalTime end = LocalTime.of(17, 10, 58);
		
		Duration between = Duration.between(start, end);
		
//		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");  
//		System.out.println("시간 차이 : " + between.format(fm1)); //Duration, Period 클래스에는 format메소드가 정의되어 있지 않음
//		                                                        LacalDate, LocalTime, LocalDateTime, ZonedDateTime 클래스에는 모두 정의되어 있음.
		System.out.println("시간 차이 : " + between);
		
	}

}


