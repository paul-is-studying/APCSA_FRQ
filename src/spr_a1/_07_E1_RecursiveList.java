package spr_a1;

import java.util.ArrayList;

public class _07_E1_RecursiveList {
	
	public static void main(String[] args) {

		// the following prints all the numbers in list
		// output: 1 2 3 4 5 6 7 8 9 10 
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			list.add(i+1);
		}
		System.out.println(list);
		
		print(list);
		
	}
	
	// recursively implement print()
	public static void print(ArrayList<Integer> list) {

	}
	

	
}
