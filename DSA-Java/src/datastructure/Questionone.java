package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Questionone {

	public static void main(String[] args) {
		//convert array to list
		//first method
		String[] arr1 = {"Bob", "Dylan", "Brendan"};
		List list = Arrays.asList(arr1);
		System.out.println(list);
		
		//second method
		List<String> li = new ArrayList<>();
		Collections.addAll(li, arr1);
		System.out.println(li);
		//third method
		List<String> l = new ArrayList<>();
		for( String n: arr1) {
			l.add(n);
		}
		System.out.print(l);
		
		//ArrayList<String>  al1 = new ArrayList<>();
		//al1 = arr1;
		
	

	}

}
