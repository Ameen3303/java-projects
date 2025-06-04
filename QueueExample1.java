package java_with_DSA;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {

	public static void main(String[] args) {
		Queue<String> Icecream=new LinkedList<String>();
		Icecream.add("kid 1");
		Icecream.add("kid 2");
		Icecream.add("kid 3");
		Icecream.add("kid 4");
		System.out.println(Icecream);
		
		
		System.out.println(Icecream.remove());
		System.out.println(Icecream);

		System.out.println(Icecream.poll());
		System.out.println(Icecream);



	}

}
