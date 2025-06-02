package java_with_DSA;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur day:");
		String Day=sc.nextLine().toLowerCase();
		switch(Day) {
		case "monday":
			System.out.println("lets learn java");
			break;
		case "wednesday":
			System.out.println("lets learn python");
			break;
			
		case "thursday":
			System.out.println("lets learn javaScript");
			break;

			
		case "friday":
			System.out.println("lets learn C++");
			break;

			
		case "sauturday":
			System.out.println("lets learn AdvancPython");
			break;
		case "sunday":
			System.out.println("lets learn Ruby");
			break;
			
		default:
			System.out.println("pls enter athe week days");

		}
	}

}
