package datastructure;

import java.util.Arrays;
public class Arraysort {
	//search logic uses linear search logic
	public static int search(int array[], int key) {
		for(int i =0; i<array.length; i ++) {
			if(array[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		//sort logic
		int[] arrs = new int[] { 3,5,6,87,21,45,70 };
		for(int i= 0; i<arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		System.out.println();
		Arrays.sort(arrs);
		for(int i= 0; i<arrs.length; i++) {
			System.out.print(arrs[i]+ " ");
		}
		System.out.println();
		int indexValue = search(arrs, 80);
		if(indexValue == -1) {
			System.out.print("No such value");
		}
		else {
			System.out.print("element found at index " + indexValue);
		}
		
		

	}

}
