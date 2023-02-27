package datastructure;

public class Frequency {

	public static void main(String[] args) {
		int [] arr = new int[]{2,6,4,2,6,6,5,7,6};
		// create array to check if visited
		int [] visitedarr = new int[arr.length];
		int visited = -1;
		for(int i = 0; i<arr.length; i++) {
			int count = 1;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count ++;
					visitedarr[j] = visited;
				}	
			}
			if(visitedarr[i] != visited) {
				visitedarr[i] = count;
			}
		}
		for(int i=0; i<visitedarr.length; i++) {
			if(visitedarr[i] != visited) {
				System.out.println("the frequency of element:" +arr[i] + " is : " +visitedarr[i]);
			}
		}
			
	}

}
