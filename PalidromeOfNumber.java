package java_with_DSA;

import java.util.Scanner;

public class PalidromeOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		while(n!=0)
		{
			int rem=n%10;
			 rev=rev*10+rem;
			 n=n/10;
		}
		System.out.println(rev);
		if(temp == rev) {
			System.out.println(temp+" is a palindrome");
		}else {
			System.out.println(temp+" is not a palindrome");
		}

	}

}
