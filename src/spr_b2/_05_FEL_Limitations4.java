package spr_b2;

import java.util.ArrayList;

public class _05_FEL_Limitations4 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("b");
		System.out.println(list);
		
		System.out.println("index of 'c' : " + indexC(list) );

		
	}
	
	// use a for-each loop!!
	private static int indexC(ArrayList<String> list) {

		return 0;
	}

}
