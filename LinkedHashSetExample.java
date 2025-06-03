package java_with_DSA;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
        LinkedHashSet<String> LHK = new LinkedHashSet<>();
		LHK.add("Simhadri");
		LHK.add("Sammu");
		LHK.add("Ameen");
		LHK.add("Teja");
		LHK.add("Chaithu");
		LHK.add("Hruday");
		LHK.add("Banti");
		LHK.add("Banti");
		LHK.add("Banti");
		System.out.println(LHK);//it maintains the order of insertion elements
        //hashset doesn't maintains the insertion order
		// it doesn't allows the duplicate values

		

	}

}
