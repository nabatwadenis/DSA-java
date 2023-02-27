package datastructure;

import java.util.HashMap;
import java.util.Map;

public class Questionfour {
	
	static int majorityElement(int a[], int size){
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int i: a) {
			Integer val = m.get(i);
			if(val == null) {
				m.put(i, 1);
			}else {
				m.put(i, val+1);
			}
		}
		for(Map.Entry<Integer, Integer> entry: m.entrySet()) {
			if(entry.getValue() > size/2) {
				return entry.getKey();
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int a[]= {2,3,4,5,2,3,3,3,7};
		System.out.println(majorityElement(a, 9));
		

	}

}
