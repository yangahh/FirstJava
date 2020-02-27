package chap31;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeDemo {
	public static void main(String[] args) {
		// 한국 출발 2020-03-02 14:30
		ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2020, 03, 02, 14,30), ZoneId.of("Asia/Seoul"));
		System.out.println("한국 출발 : " + departure);
		
		// 파리 도착 2020-03-02 19:20
		ZonedDateTime arrival = ZonedDateTime.of(LocalDateTime.of(2020, 03, 02, 19, 20), ZoneId.of("Europe/Paris"));
		System.out.println("파리 도착 : " + arrival);
		
		
		//비행 시간
		Duration flighTime = Duration.between(departure, arrival);
		System.out.println("비행 시간  : " + flighTime );  // 결과 : PT12H50M
		
		// 날짜 포맷 지정
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초 (VV)");  // 대문자 M은 월 정보, 소문자 m은 분 정보로 구분. VV는 시간대
		System.out.println(departure.format(fm));
	}

}
