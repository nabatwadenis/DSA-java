package datastructure;

import java.util.Scanner;

public class questiontwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		for(int i =0; i< size; i++) {
			System.out.println("Enter an element: ");
			arr1[i] = sc.nextInt();
		}
		sc.close();
		for(int i =0; i< arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
	}

}
