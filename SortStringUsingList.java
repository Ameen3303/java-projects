package java_with_DSA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStringUsingList {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("sunil","Ameen","Hasan","Hajarath","Moulali","Ameer");
		System.out.println("Before Sorting the Strings:");
		System.out.println(words);
		Collections.sort(words);
		
		System.out.println("Before Sorting the Strings:");
		System.out.println(words);
	}

}
