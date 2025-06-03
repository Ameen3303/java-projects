package java_with_DSA;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> numbers= new TreeSet<>();
		numbers.add(20);
		numbers.add(40);
		numbers.add(70);
		numbers.add(10);
		numbers.add(30);
		numbers.add(90);
		numbers.add(50);
		numbers.add(60);
		numbers.add(80);
		System.out.println(numbers);
		System.out.println("FIRST VALUE="+numbers.first());
		System.out.println("HIGHEST VALUE="+numbers.higher(30));
		System.out.println("SMALLER VALUE="+numbers.lower(30));
		System.out.println("SIZE="+numbers.size());
		System.out.println("FIRST VALUE="+numbers.pollFirst());


	}

}
