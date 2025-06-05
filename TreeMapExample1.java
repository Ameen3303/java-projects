package java_with_DSA;

import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		
		TreeMap<String,String> tm=new TreeMap<>();
		tm.put("India", "NewDelhi");
		tm.put("USA", "Washington");
		tm.put("Germany", "Berlin");
		tm.put("Japan", "Tokyo");
		tm.put("India", "Delhi");
		System.out.println(tm);
		System.out.println(tm.containsKey("India"));
		System.out.println(tm.containsValue("NewDelhi"));
		System.out.println(tm.lowerKey("USA"));
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm);

		

		
		

	}

}
