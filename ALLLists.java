package java_with_DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

class ArrayListPractice{
	public ArrayListPractice() {
		System.out.println("List of STUDENTS:");
		ArrayList<String> Students=new ArrayList<String>();
		Students.add("Ameen");
		Students.add("Afrid");
		Students.add("Anil");
		Students.add("madhu");
		Students.add("Hruday");
		Students.add("Ameen");
		System.out.println(Students);//does allows duplicates
	}
}


class LinkedListPractice extends ArrayListPractice{
	public LinkedListPractice() {
		System.out.println("List of Employees:");
		LinkedList<String> Employees=new LinkedList<String>();
		Employees.add("Ameen");
		Employees.add("Afrid");
		Employees.add("Anil");
		Employees.add("madhu");
		Employees.add("Hruday");
		Employees.add("Ameen");
		System.out.println(Employees);//does allows duplicates
	}
}


class HashSetPractice extends LinkedListPractice{
	public HashSetPractice()
	{
		System.out.println("List of KiDS:");		
		HashSet<String> Kids=new HashSet<String>();
		Kids.add("A");
		Kids.add("B");
		Kids.add("R");
		Kids.add("K");
		Kids.add("J");
		Kids.add("A");
		System.out.println(Kids);//doesn't allows duplicates
		
	}
}
class HashMapPractice extends HashSetPractice{
	public HashMapPractice()
	{
		System.out.println("List of Students with their rolls:");
		HashMap<Integer,String> stds=new HashMap<Integer,String>();
		stds.put(101,"A");
		stds.put(102,"B");
		stds.put(103,"R");
		stds.put(108,"K");
		stds.put(109,"J");
		stds.put(105,"A");
		System.out.println(stds);//it doesn't allows duplicate keys and 
		//it allows duplicate values

	}
}
public class ALLLists {
	public static void main(String[] args) {
		
		
				HashMapPractice Hm=new HashMapPractice();
		
		
		
	}

}
