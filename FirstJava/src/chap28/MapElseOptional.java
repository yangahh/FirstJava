package chap28;

import java.util.Optional;

class ContInfo{
	String phone;  // null일 수 있음
	String adrs;   // null일 수 있음
	
	public ContInfo(String ph, String ad) {
		phone = ph;
		adrs = ad;
	}
	public String getPhone() {
		return phone;
	}
	public String getAdrs() {
		return adrs;
	}
	
}

public class MapElseOptional {
	public static void main(String[] args) {
		Optional<ContInfo> ci = Optional.of(new ContInfo(null, "Korea")); // ContInfo인스턴스가 담긴 Optional 인스턴스 생성
		String phone = ci.map(c -> c.getPhone()).orElse("There is no phone number.");
		String adrs = ci.map(c -> c.getAdrs()).orElse("There is no address.");
		
		System.out.println(phone);
		System.out.println(adrs);
		
	}

}
