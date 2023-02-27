package datastructure;

import java.util.HashSet;

public class Missingnum {

	public static void main(String[] args) {
		

	}
	public static void missingNums(Integer a[]) {
		HashSet<Integer> s = new HashSet<>();
		for(int num: a) {
			s.add(num);
		}
		int n = a.length+1;
		for(int i=0; i<n;i++) {
			if(!s.contains(i)) {
				
			}
		}
	}

}
