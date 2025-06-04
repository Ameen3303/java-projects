package java_with_DSA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueueExample {

	public static void main(String[] args) {
		
		//Stack
		Stack<String> ToyBox=new Stack<>();
		ToyBox.push("Ball");
		ToyBox.push("Blocks");
		ToyBox.push("puzzle");
		System.out.println("Stack="+ToyBox);
		
		System.out.println(ToyBox.pop());
		System.out.println(ToyBox);
		
		//Queue
		Queue<String> kids=new LinkedList<String>();
		kids.add("maya");
		kids.add("leo");
		kids.add("nina");
		System.out.println("Queue="+kids);
		
		System.out.println(kids.poll());
		System.out.println(kids);
		

		

		
		
		

		
	}

}
