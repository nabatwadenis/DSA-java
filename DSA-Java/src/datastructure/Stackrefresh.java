package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class Stackrefresh {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		s1.push(5);
		s1.push(7);
		s1.push(3);
		System.out.print(s1);
		s1.sort(null);
		System.out.println();
		System.out.print(s1);
		
		Iterator<Integer> it = s1.iterator();
		while(it.hasNext()) {
			Object s2 = it.next();
			System.out.print(s2 + " ");
		}
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		
		
		

	}

}
