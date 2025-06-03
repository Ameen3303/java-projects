package java_with_DSA;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
        LinkedHashMap<Integer, String> LHM = new LinkedHashMap<>();
        LHM.put(3303, "Ameen");
        LHM.put(3325, "hruday");
        LHM.put(3304, "Anil");
        LHM.put(3301, "Afrid");
        LHM.put(3319, "teja");
        LHM.put(3321, "hari");
        LHM.put(3309, "Ameen");
        System.out.println(LHM);//it maintains the order of insertion elements
        //hashmap doesn't maintains the insertion order
        //it doesn't allows the duplicates
        System.out.println(LHM.containsKey(3304));
        System.out.println(LHM.containsValue("teja"));



	}

}
