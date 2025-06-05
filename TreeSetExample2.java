package java_with_DSA;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
			ts.add("keyboard");
			ts.add("mouse");
			ts.add("cpu");
			ts.add("ram");
			ts.add("monitor");
			
			System.out.println(ts);
			
			ts.add("Keyboard");
			System.out.println(ts);//it dont allows the duplicates and not inordered
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a name= ");
			String name=sc.nextLine().toLowerCase();
			if(ts.isEmpty()) {
				System.out.println("invalid");
			}
			else {
			
			   if(ts.contains(name))
			     {
				   System.out.println(name +" is Found");
				
			      }
			     else
			     {
				     System.out.println("not found");
			      }
			    }
          sc.close();
          System.out.println("----------");
			for(String TS:ts) {
				System.out.println(TS);
			}

			
	}

}
