package chap23;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapIteration {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();  // 정렬하여 저장하는 Map
		map.put(45, "Brown");
		map.put(30, "James");
		map.put(20, "Martin");
		map.put(50, "Tom");	
		
		
		Set<Integer> keySet = map.keySet();
		for(Integer i : keySet)
			System.out.print(i + "\t");
		System.out.println();
		
		
		// value 출력
//		Iterator<Integer> itr = keySet.iterator();
//		while(itr.hasNext()) {
//			String value = map.get(itr.next());
//			System.out.println(itr.next() + ", " + value);
//		}
		for(Iterator<Integer> itr = keySet.iterator(); itr.hasNext();) {
			System.out.print(map.get(itr.next()) + "\t");
		}
		System.out.println();
		
		// key, value 출력
		for(Integer i : keySet) {
			System.out.println(i + ", " + map.get(i));
		}
		
	}

}
