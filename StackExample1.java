package java_with_DSA;

import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		Stack<String> burgerStack=new Stack<>();
		//Stack is simple data Structure and that strores items in last-in-first-out(LIFO) order 

		burgerStack.push("Burger1");
		burgerStack.push("Burger2");
		burgerStack.push("Burger3");
		burgerStack.push("Burger1");
		burgerStack.push("Burger4");
		burgerStack.push("Burger5");
		
		
		System.out.println(burgerStack);//it allows the duplicates

		System.out.println("Top burger is="+burgerStack.peek());
		
		System.out.println("Serving="+burgerStack.pop());
		System.out.println(burgerStack);

		
		if(burgerStack.isEmpty())
		{
			System.out.println("All bur`gers are served");
		}

	}

}
