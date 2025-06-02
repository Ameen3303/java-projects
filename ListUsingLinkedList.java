package java_with_DSA;

import java.util.Collections;
import java.util.LinkedList;

public class ListUsingLinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<String> StudentName=new LinkedList<>();
		StudentName.add("Ameen");
		StudentName.add("Kiran");
		StudentName.add("Madhu");
		StudentName.add("Hruday");
		StudentName.add("Hruday");
		StudentName.add("Hruday");

		System.out.println(StudentName);
		
		Collections.sort(StudentName);
		for(int i=0;i<=StudentName.size();i++)
		{
			System.out.println(StudentName.get(i));
		}
		
	}

}
//Linkedlist does allows the duplicates

