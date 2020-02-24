package chap28;

import java.util.Optional;

class Friend {
    String name;
    Company cmp;    // null 일 수 있음

    public Friend(String n, Company c) {
        name = n;
        cmp = c; // c가 null인지 확인 필요
    }
    public String getName() { return name; }
    public Company getCmp() { return cmp; }
}

class Company {
    String cName;
    ContInfo2 cInfo;    // null 일 수 있음

    public Company(String cn, ContInfo2 ci) {
        cName = cn;
        cInfo = ci;
    }
    public String getCName() { return cName; }
    public ContInfo2 getCInfo() { return cInfo; }

}

class ContInfo2 {
    String phone;   // null 일 수 있음
    String adrs;    // null 일 수 있음

    public ContInfo2(String ph, String ad) {
        phone = ph;
        adrs = ad;
    }
    public String getPhone() { return phone; }
    public String getAdrs() { return adrs; }

}

public class NullPointerCaseStudt2 {
	public static void showCompAddr(Optional<Friend> f) {
		String addr = f.map(Friend::getCmp)   // map(a -> a.getCmp())
					   .map(Company::getCInfo) // map(a -> a.getCInfo())
					   .map(ContInfo2::getAdrs)  // map(a -> a.getAdrs())
					   .orElse("There's no address information.");
		
		System.out.println(addr);
	}
	public static void main(String[] args) {
		ContInfo2 ci = new ContInfo2(null, "Korea");
		Company cp = new Company("BD", ci);
		Friend frn = new Friend("Kim", cp);
		
		showCompAddr(Optional.of(frn));
	}

}
