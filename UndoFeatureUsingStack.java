package java_with_DSA;

import java.util.Stack;

public class UndoFeatureUsingStack {

	public static void main(String[] args) {
		Stack<String> Undo=new Stack<>();
		Undo.push("write");
		Undo.push("delete");
		Undo.push("insert");
		System.out.println(Undo);
		
		System.out.println(Undo.peek());
		System.out.println(Undo);
		System.out.println(Undo.remove(1));

		System.out.println(Undo);


	}

}
