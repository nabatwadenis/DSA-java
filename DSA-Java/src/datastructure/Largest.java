package datastructure;

public class Largest {

	public static void main(String[] args) {
		int[] a = {2,4,5,7,98,1,205};
		//find the largest number in an array
		int maxNum = a[0];
		for(int i =0; i<a.length; i++) {
			if(a[i] > maxNum) {
				maxNum = a[i];
			}
		}
		System.out.println("The largest number is: "+maxNum);

	}

}
