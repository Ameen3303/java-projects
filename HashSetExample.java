package java_with_DSA;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> StudentName=new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the names of 5 students:");
		for(int i=1;i<=5;i++)
		{
			System.out.println("enter the name of student"+i+":");
			String Sname=sc.nextLine();
			StudentName.add(Sname);
		}
		System.out.println(StudentName);
		for(String Student:StudentName) {
			System.out.println(Student);
		}

	}

}
