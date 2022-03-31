package spr_b4;

public class _01_Boolean {

	public static void main(String[] args) {

		// Boolean: a type of variable that can hold true/false states
		boolean state = true;
		
		System.out.println(state);
		state = false;
		System.out.println(state);
		
		// relational operators
		/* 
		  ==		// EQUAL
		  !=		// NOT equal
		  <, >
		  <=, >=
		  Note: relational operators have a lower precedence than arithmetic operators
		 */
		
		state =  0 == 0;
		System.out.println("0 == 0 : "+state);
		state =  1 == 0;
		System.out.println("1 == 0 : "+state);
		state =  3 > 0;
		System.out.println("3 > 0 : "+state);
		
		/* 
		 * note: '=' is different from '=='
		 * this will not compile:
		 * state =  0 = 0;
		 */		

	}

}
