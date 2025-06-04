package java_with_DSA;

import java.util.Stack;

public class StackExample2 {

	public static void main(String[] args) {
		Stack<String> Plates=new Stack<>();
		//Stack is simple data Structure and that strores items in last-in-first-out(LIFO) order 
		Plates.push("plate1");
		Plates.push("plate2");
		Plates.push("plate3");
		Plates.push("plate4");
		Plates.push("plate5");
		System.out.println(Plates);
		
		System.out.println("now Top plate in the stack="+Plates.peek());
		
		System.out.println("the Stack elements are=");
		for(String plate:Plates)
		{
			System.out.println(plate);
		}
		
		//System.out.println(Plates.getFirst());


	}

}
