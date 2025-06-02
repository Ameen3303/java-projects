package java_with_DSA;

import java.util.HashMap;

public class ListUsingHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> Studentrolls=new HashMap<>();
		Studentrolls.put(1, "Afridee");
		Studentrolls.put(2, "Ameen");
		Studentrolls.put(3, "Anil");
		Studentrolls.put(4, "chaitu");
		Studentrolls.put(5, "teja");
		Studentrolls.put(6, "Afridee");
		System.out.println(Studentrolls);

		Studentrolls.remove(1);
		System.out.println(Studentrolls);
		
		Studentrolls.put(1,"Sammu");
		System.out.println(Studentrolls);





	}

}
