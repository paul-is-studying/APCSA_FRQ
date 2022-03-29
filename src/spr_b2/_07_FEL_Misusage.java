package spr_b2;

import java.util.Arrays;

public class _07_FEL_Misusage {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 4 };
		
		System.out.println(Arrays.toString(arr));
		
		// write a method that prints all elements of arr
		print(arr);
		
	}

	// use a for-each loop!
	private static void print(int[] arr) {
		for(int i : arr) {
			System.out.print(arr[i]+" ");
		}
	}
	// why did this work?
	

}
