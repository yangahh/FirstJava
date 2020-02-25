//package chap28;
//
//import java.util.Optional;
//
//class ContInfo3{
//	Optional<String> phone;  // null일 수 있음
//	Optional<String> adrs;   // null일 수 있음
//	
//	public ContInfo3(Optional<String> ph, Optional<String> ad) {
//		phone = ph;
//		adrs = ad;
//	}
//	public Optional<String> getPhone(){
//		return phone;
//	}
//	public Optional<String> getAdrs(){
//		return adrs;
//	}
//}
//
//public class FlatMapElseOptional {
//	public static void main(String[] args) {
//		Optional<ContInfo3> ci = Optional.of(new ContInfo3(Optional.ofNullable(null), Optional.ofNullable(null)));   // Optional.ofNullable, Optional.of메소드는 static 메소드
//		
//		String phone = ci.flatMap(c -> c.getPhone()).orElse("There is no phone number");
//		String adrs = ci.flatMap(c -> c.getAdrs()).orElse("There is no address");
//		
////		String phone = ci.flatMap(ContInfo3::getPhone).orElse("There is no phone number");
////		String adrs = ci.flatMap(ContInfo3::getAdrs).orElse("There is no address");
//		
//		System.out.println(phone);
//		System.out.println(adrs);
//	}
//
//}
