package java_with_DSA;

import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		//store student marks
		//search in TreeMap
		//make simple phone book
		TreeMap<String,Long> StuMarks=new TreeMap<>();
	
		StuMarks.put("MSD", (long) 91);
		StuMarks.put("VK", (long) 70);
		StuMarks.put("ROHIT", (long) 78);
		StuMarks.put("KL", (long) 56);
		StuMarks.put("JADDU", (long) 75);
		StuMarks.put("HP", (long) 91);
		System.out.println("StudentMarks="+StuMarks);//in treemap values are stored in ordered form
		
		
		//search in treemap
		System.out.println(StuMarks.containsKey("MSD"));
		System.out.println(StuMarks.containsValue(56));
		
		//make simple phonebook
		TreeMap<String,Long> StuMarkss=new TreeMap<>();
		
		StuMarkss.put("A", (long) 912345765);
		StuMarkss.put("B", (long) 708738836);
		StuMarkss.put("C", (long) 789859879);
		StuMarkss.put("K", (long) 569598238);
		StuMarkss.put("E", (long) 754628188);
		StuMarkss.put("D", (long) 468321897);
		System.out.println("PhoneBook="+StuMarkss);
		
		
		
		
		
		
		

	}

}
