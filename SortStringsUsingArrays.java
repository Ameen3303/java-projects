package java_with_DSA;

import java.util.Arrays;

public class SortStringsUsingArrays {

	public static void main(String[] args) {
		
		String[] nums= {"sunil","Ameen","Hasan","Hajarath","Moulali","Ameer"};
		System.out.println("before sorting Strings: "+Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println("After sorting Strings :"+Arrays.toString(nums));
	}

}
