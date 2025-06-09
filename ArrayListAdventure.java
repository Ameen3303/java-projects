package java_with_DSA;

import java.util.ArrayList;

public class ArrayListAdventure {

	public static void main(String[] args) {
		
		ArrayList<String> Cartoon=new ArrayList<>();
		Cartoon.add("Chotabheem");
		Cartoon.add("MotuPathulu");
		Cartoon.add("Little Krishna");
		Cartoon.add("Dragon");
		Cartoon.add("BenTen");
		System.out.println(Cartoon);
		
		System.out.println(Cartoon.remove(3));
		
		System.out.println(Cartoon.set(2, "LittleSingham"));
		
		System.out.println(Cartoon);
		for(String cart:Cartoon) {
			System.out.println(cart);
		}

	}

}
