package java_with_DSA;

import java.util.Scanner;

public class RainUmbrella {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("isRaining or not:");
		String isRaining=sc.nextLine();
		if(isRaining.equals("yes")) {
			System.out.println("take an umbrella");
		}
		else if(isRaining.equals("no")) {
			System.out.println("no need of umbrella");
		}
		else {
			System.out.println("invald input pls enter the Yes or No");
		}

	}

}
