package java_with_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample1 {

	public static void main(String[] args) {
		String[] names= {"amit","divya","karan","priya","zoya"};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name=");
		String str=sc.nextLine().toLowerCase();
		if(Arrays.asList(names).contains(str)) {
			System.out.println(str+ " is founded");
			
		}
		else {
			System.out.println(str+ " is not found");
		}
		
		System.out.println("array contains elements");//appropriate msg printed

	}

}
