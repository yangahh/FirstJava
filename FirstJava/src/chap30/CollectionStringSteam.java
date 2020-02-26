package chap30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStringSteam {
	public static void main(String[] args) {
		String[] words = {"hello", "Box", "R", "Tt"};
		Stream<String> ss = Arrays.stream(words);
		
		List<String> ls = ss.filter(s -> s.length() > 2)
				.collect(() -> new ArrayList<>(),
						 (c, s) -> c.add(s),
						 (lst1, lst2) -> lst1.addAll(lst2));
		
		System.out.println(ls);
				
		
	}

}
