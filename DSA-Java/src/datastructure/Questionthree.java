package datastructure;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Questionthree {

	public static void main(String[] args) {
		// given
		Integer [] arr1 = {1,2,3,9,8,7};
		Integer [] arr2 = {4,1,2,10,15};
		Integer [] arr3 = {5,1,2,4,10};
		
		HashSet<Integer> s1 = new HashSet<>();
		List<Integer> l1 = Arrays.asList(arr1);
		List<Integer> l2 = Arrays.asList(arr2);
		List<Integer> l3 = Arrays.asList(arr3);
		s1.addAll(l1);
		s1.addAll(l2);
		s1.addAll(l3); 
		List<Integer> finallist = new ArrayList<Integer>();
		for(Integer number: s1) {
			if(l1.contains(number) && l2.contains(number) ||
					l2.contains(number) && l3.contains(number) ||
					l3.contains(number) && l1.contains(number)) {
				finallist.add(number);	
			}
		}
		System.out.println(finallist);
		

	}

}
