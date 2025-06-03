package java_with_DSA;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> nums=new TreeMap<>();
		nums.put(1,"Ameen");
		nums.put(2,"ms");
		nums.put(3,"vk");
		nums.put(4,"kl");
		nums.put(5,"Ameen");
		nums.put(9,"rg");
		nums.put(8,"pant");
		nums.put(1,"Ameen");
		nums.put(1,"Ameen");
		/*try {
		System.out.println(nums.putFirst(15,"rohit"));
		}catch(Exception e)
		{
			System.out.println(e);
		}*/
		
		
		System.out.println(nums.replace(1, "Ameen", "Amin"));//it return true

		System.out.println(nums.replace(18, "Ameen", "Amin"));//it return false
		
		System.out.println(nums);

 
	}

}
