package chap28;

import java.util.Optional;

class Friend2 {
    String name;
    Optional<Company2> cmp;    // null 일 수 있음

    public Friend2(String n, Optional<Company2> c) {
        name = n;
        cmp = c; // c가 null인지 확인 필요
    }
    public String getName() { return name; }
    public Optional<Company2> getCmp() { return cmp; }
}

class Company2 {
    String cName;
    Optional<ContInfo3> cInfo;    // null 일 수 있음

    public Company2(String cn, Optional<ContInfo3> ci) {
        cName = cn;
        cInfo = ci;
    }
    public String getCName() { return cName; }
    public Optional<ContInfo3> getCInfo() { return cInfo; }

}


class ContInfo3{
	Optional<String> phone;  // null일 수 있음
	Optional<String> adrs;   // null일 수 있음
	
	public ContInfo3(Optional<String> ph, Optional<String> ad) {
		phone = ph;
		adrs = ad;
	}
	public Optional<String> getPhone(){
		return phone;
	}
	public Optional<String> getAdrs(){
		return adrs;
	}
}

public class NullPointerCaseStudy3 {
	public static void showCompAddr(Optional<Friend2> f){
		String addr = f.flatMap(Friend2::getCmp)
				       .flatMap(Company2::getCInfo)
				       .flatMap(ContInfo3::getAdrs)
				       .orElse("There's no address information");
		System.out.println(addr);
	}

	public static void main(String[] args) {
		Optional<ContInfo3> ci = Optional.of(new ContInfo3(Optional.ofNullable(null), Optional.ofNullable("")));
		Optional<Company2> cp = Optional.of(new Company2("BD", ci));
		Optional<Friend2> frn = Optional.of(new Friend2("Park", cp));
		
		showCompAddr(frn);
	}

}
