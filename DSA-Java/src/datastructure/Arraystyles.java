package datastructure;

public class Arraystyles {

	public static void main(String[] args) {
		int[][] arr3 = new int[4][4];
		int count = 1;
		for(int i = 0; i<arr3.length; i++) {
			for(int j = 0; j< arr3[i].length; j++) {
				arr3[i][j] = count;
				count++;
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//create an incline display
		int[][] inc = new int[4][4];
		int sum = 1;
		for(int k = 0; k <inc.length; k++) {
			for(int l = 0; l < inc[k].length; l++) {
				inc[k][l] = sum;
				if(k == l) {
					System.out.print("x");
				}
				sum++;	
			}
			System.out.println();
			
		}
		
	}

}
