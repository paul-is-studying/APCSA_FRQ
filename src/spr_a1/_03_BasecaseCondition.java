package spr_a1;

public class _03_BasecaseCondition {
	
	public static void main(String[] args) {

		// print all odd numbers from 1 to 10
		mystery(1);
		
	}
	
	// what's wrong with this implementation?
	public static void mystery(int n) {
		// base case
		if(n==10) { 
			
		}
		// recursive case
		else {
			System.out.println(n);
			mystery(n+2);
		}
	}



}
