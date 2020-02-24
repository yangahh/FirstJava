package chap27;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length(); // String을 인자로, Integer를 반환값으로. = (String s) -> {return s.length();}; 와 같음
		System.out.println(f.apply("Robot"));
		System.out.println(f.apply("toy"));
		
		Function<Double, Double> cti = d -> d * 0.393701; // Double을 인자로, Double를 반환값으로. = (Double d) -> {return d * 0.34;}; 와 같음
		Function<Double, Double> itc = d -> d * 2.54; // Double을 인자로, Double를 반환값으로. = (Double d) -> {return d * 0.34;}; 와 같음
		
		System.out.println("1cm = " + cti.apply(1.0) + "inch");
		System.out.println("1inch = " + itc.apply(1.0) + "cm");
		
	}

}
