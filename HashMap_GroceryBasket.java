package java_with_DSA;

import java.util.HashMap;

public class HashMap_GroceryBasket {

	public static void main(String[] args) {
		HashMap<String,Integer> HM=new HashMap<>();
		HM.put("Apples", 40);
		HM.put("Milk", 50);
		HM.put("Bananas", 60);
		HM.put("Flowers", 20);
		HM.put("Orange", 80);
		System.out.println(HM);
		
		HM.put("Milk", 100);
		System.out.println(HM);
		
		System.out.println(HM.remove("Flowers", 20));
		System.out.println(HM);
		
		
		
		

		

	}

}
