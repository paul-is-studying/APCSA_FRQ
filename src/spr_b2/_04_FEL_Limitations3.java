package spr_b2;

import java.util.ArrayList;

public class _04_FEL_Limitations3 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("b");
		System.out.println(list);
		
		// remove all "a"s from this list
		removeAs(list);
		
		System.out.println(list);
		
	}
	
	// use a for-each loop!!
	private static void removeAs(ArrayList<String> list) {

	}
	

}
