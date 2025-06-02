package java_with_DSA;

import java.util.ArrayList;
import java.util.Collections;

public class ListUsingArrayList {

	public static void main(String[] args) {
		ArrayList<String> StudentsName=new ArrayList<>();
		StudentsName.add("Ameen");
		StudentsName.add("kiran");
		StudentsName.add("madhu");
		StudentsName.add("hruday");
		StudentsName.add("hruday");
		StudentsName.add("Dost");
		StudentsName.add("Macha");

		System.out.println(StudentsName);
		
		StudentsName.remove(3);
		//StudentsName.remove("Ameen");
		System.out.println("remove:"+StudentsName);
		
		Collections.reverse(StudentsName);
		System.out.println("reverse:"+StudentsName);
		
		Collections.sort(StudentsName);
		System.out.println("sorting:"+StudentsName);
		
		Collections.shuffle(StudentsName);
		System.out.println("shuffling:"+StudentsName);

		for(String student:StudentsName)
		{
			System.out.println(student);
		}

			

	}

}
//ArrayList does allows the duplicates
