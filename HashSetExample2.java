package java_with_DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {

	public static void main(String[] args) {
		HashSet<String> Students=new HashSet<String>();
		Students.add("Ameen");
		Students.add("Kiran");
		Students.add("Madhu");
		Students.add("Hruday");
		Students.add("Hruday");
		Students.add("Hruday");
		
		System.out.println(Students);
		//Students.contains("Ameen");
		//System.out.println(Students);
		
		ArrayList<String> StudentsList=new ArrayList<>(Students);//here we converts the hashset into arrayList
		System.out.println(StudentsList);
		
		Iterator<String> it=Students.iterator();
		while(it.hasNext())

		{
			String name=it.next();
			System.out.println(name);
		}

	}

}
//hashset doesn't allows the duplicate values
