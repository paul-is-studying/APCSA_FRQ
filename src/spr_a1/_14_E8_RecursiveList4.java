package spr_a1;

import java.util.ArrayList;

public class _14_E8_RecursiveList4 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<5; i++) {
			list.add(i+1);
		}
		System.out.println(list);
		System.out.println("========================");
		
		// print a pyramid of numbers
		// output:
		/*
		[1]
		[1, 2]
		[1, 2, 3]
		[1, 2, 3, 4]
		[1, 2, 3, 4, 5]
		 */
		// HINT: use System.out.println(list) to print each line
		// HINT2: you may remove numbers from list in recursive calls
		
		pyramid(list);
		
	}

	// do this recursively! ( no loops! )
	public static void pyramid(ArrayList<Integer> list) {
		
	}
	
}
