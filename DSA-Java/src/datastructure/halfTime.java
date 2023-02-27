package datastructure;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;



public class halfTime {

	public static void main(String[] args) {
		Integer[] arr1 = {2,3,5,4,7,9};
		Integer[] arr2 = {2,8,3,9,0};
		Integer[] arr3 = {4,1,9,5};
		
		List<Integer> l1 = Arrays.asList(arr1);
		List<Integer> l2 = Arrays.asList(arr2);
		List<Integer> l3 = Arrays.asList(arr3);
		
		HashSet<Integer> s1 = new HashSet<>();
		s1.addAll(l1);
		s1.addAll(l2);
		s1.addAll(l3);
		
		List<Integer> finale = new ArrayList<Integer>();
		for(Integer num: s1) {
			if(l1.contains(num) && l2.contains(num) ||
					l2.contains(num) && l3.contains(num) ||
					l1.contains(num) || l3.contains(num)) {
				finale.add(num);
			}
			
		}
		System.out.print("The common numbers in the arrays are:" +finale);

	}

}
