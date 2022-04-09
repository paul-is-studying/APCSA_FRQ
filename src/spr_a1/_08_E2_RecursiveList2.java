package spr_a1;

import java.util.ArrayList;

public class _08_E2_RecursiveList2 {
	
	public static void main(String[] args) {

		// the following prints all the numbers in list, backwards!
		// output: 10 9 8 7 6 5 4 3 2 1 
		
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
