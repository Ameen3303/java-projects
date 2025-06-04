package java_with_DSA;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {

	public static void main(String[] args) {
		//Queue is a data structure and that Stroes the items in First-in-first-out(FIFO) order
		Queue<String> Students=new LinkedList<String>();
		Students.add("Student 1");
		Students.add("Student 2");
		Students.add("Student 3");
		
		System.out.println(Students);
		
		String firstout=Students.poll();
		System.out.println(firstout);
		System.out.println(Students);
		
		System.out.println(Students.remove());
		System.out.println(Students);
		
		//both remove() and poll() methods are same operation performed

	}

}
