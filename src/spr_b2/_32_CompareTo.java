package spr_b2;

import java.util.ArrayList;

public class _32_CompareTo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		list.add("iguana");
		list.add("racoon");

		System.out.println(list);
		
		insertAscending(list, "parrot");
		insertAscending(list, "ant");
		insertAscending(list, "zombie");
		
		System.out.println(list);
	}

	// complete method insertAscending
	/**
	 * inserts s in list so that list is sorted in lexicographical order
	 * @param list
	 * @param s
	 */
	private static void insertAscending(ArrayList<String> list, String s) {

	}
	
}
