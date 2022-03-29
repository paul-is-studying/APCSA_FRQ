package spr_b2;

import java.util.ArrayList;

public class _31_Insertion {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=3; i<16; i+=2) {
			list.add(i);
		}
		System.out.println(list);
		
		insertAscending(list, 6); // middle
		insertAscending(list, 1); // begin
		insertAscending(list, 17); // end
		
		System.out.println(list);
	}

	// complete method insertAscending
	/**
	 * inserts n in list so that list is sorted in ascending order
	 * @param list
	 * @param n
	 */
	private static void insertAscending(ArrayList<Integer> list, int n) {

		
	}
	
}
