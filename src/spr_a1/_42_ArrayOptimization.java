package spr_a1;

import java.util.Arrays;

public class _42_ArrayOptimization {

	public static void main(String[] args) {

		String[] sarr = {
			"ab",
			"abc",
			"a",
			"abcd",
			"abcde",
		};
		
		// 1. set to null all elements with length less than 3

		
		System.out.println(Arrays.toString(sarr));
		// 2. push all nulls to the back, preserving initial order

		
		System.out.println(Arrays.toString(sarr));
	}
	
}
