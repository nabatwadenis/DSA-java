package datastructure;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] arr2= new int[3][4];
		int count = 1;
		for(int i=0; i< arr2.length; i++) {
			for(int j=0; j< arr2[i].length; j++) {
				arr2[i][j] = count;
				count++;
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
