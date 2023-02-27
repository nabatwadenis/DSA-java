package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class Stacksolution {

	public static void main(String[] args) {
		//creating a stack
		Stack<Integer> s1 = new Stack<>();
		//inserting elements
		s1.push(34);
		s1.push(4);
		s1.push(9);
		//deleting element
		s1.pop();
		System.out.println(s1);
		//peek operation
		System.out.println(s1.peek());
		//isempty operation
		boolean status = s1.empty();
		System.out.println(status);
		//search: has a return type of integer
		int indexfound = s1.search(34);
		System.out.println(indexfound);
		
		//iterating over a stack uses a method called iterator and while loop
		Iterator it = s1.iterator();		
		while(it.hasNext()) {
			Object s2 = it.next();
			System.out.print(s2 +" ");
		}
		System.out.println();
		System.out.println(s1.size());
		s1.sort(null);
		System.out.println(s1);

	}

}
