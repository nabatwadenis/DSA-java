package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Llist {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(3);
		l1.add(7);
		l1.add(5);
		l1.add(2, 8);
		//removing elements from linkedlist
		l1.remove();
		Iterator it =l1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.print(l1.size());
		//searching
		boolean b1 = l1.contains(1);
		System.out.print(b1);
		System.out.println();
		
		//copy elements from stack to linkedlist
		Stack<String> s1 = new Stack<>();
		LinkedList<String> l2 = new LinkedList<>();
		s1.push("hello");
		s1.push("bye");
		s1.push("sayonara");
		//to copy to linkedlist
		l2.addAll(s1); //let the data types be identical
		
		Iterator it1 = l2.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
			
		}
		
		
		

	}

}
