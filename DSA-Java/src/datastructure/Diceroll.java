package datastructure;

public class Diceroll {

	public static void main(String[] args) {
		int n = 2; //number of dice
		int a = 6; // number of faces on each dice
		int s = 7;
		
		int ways = countWays(n, a, s);
		System.out.println("The number of ways to make sum: " +s+ " is: " +ways);

	}
	public static int countWays(int n, int s, int a) {
		if(n ==  0 && s == 0) {
			return 1;
		}
		if(n == 0 || s < 0) {
			return 0;
		}
		//recursion to find all possible ways
		int ways =0;
		for (int i =1; i<= a; i++) {
			ways += countWays(n -1,a,s-i);	
		}
		return ways;
		
	}

}
