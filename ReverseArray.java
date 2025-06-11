package java_with_DSA;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		String[] arr= {"sunil","Ameen","Hasan","Hajarath","Moulali","Ameer"};
		System.out.println("Before reverse the Array:");
		System.out.println(Arrays.toString(arr));
		
		int left=0;
		int right=arr.length-1;
		while(left < right) {
			String temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
		}
		
		System.out.println("\n After reverse the String:");
			System.out.println(Arrays.toString(arr));
		
	}

}
