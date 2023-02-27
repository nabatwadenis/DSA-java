package datastructure;



public class Testone {

	public static void main(String[] args) {
		int [] a = {1,3,4,5,6};
		int rev = findSmallestAbsent(a);
		System.out.println(rev);
		

	}
	public static int findSmallestAbsent(int[] a) {
		int n= a.length;
		boolean[] present = new boolean [n+1];
		
		for(int i=0; i<n;i++) {
			if(a[i] >0 && a[i] <= n) {
				present[a[i]] =true;
			}
		}
		for(int i=1; i<=n;i ++) {
			if(!present[i]) {
				return i;
			}
		}
		return n+1;
		
	}

}
