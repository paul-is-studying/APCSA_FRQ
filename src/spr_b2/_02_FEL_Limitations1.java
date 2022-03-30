package spr_b2;

import java.util.Arrays;

public class _02_FEL_Limitations1 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		
		System.out.println(Arrays.toString(arr));
		
		// use this method to multiply each element in arr by two
		timesTwo(arr);
		
		System.out.println(Arrays.toString(arr));
		// what happened?
		
	}
	
	// use a for-each loop to add multiply each element by two
	private static void timesTwo(int[] arr) {
//		for(int num:arr){
//			num *= 2;
//		}
		// primitive & Strings : pass by value
		// objects : pass by reference
		// use a for-each loop to add multiply each element by two
		for (int i = 0 ; i<arr.length ; i++){
			arr[i] = arr[i]*2;
		}
	}


}
