package spr_a1;

public class _24_TriggerLogic4 {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 3, 5, 7, 9};
		int[] arr2 = {1, 3, 5, 8, 9};
		int[] arr3 = {2, 4, 6, 8, 10};
		int[] arr4 = {}; // none is odd, so false <== specific instructions!!
		
		// should print [ odd, NOT, NOT, NOT ]
		if( allOdd(arr1) ) {
			System.out.println("arr1: all odd!");
		} else {
			System.out.println("arr1: all NOT odd!");
		}
		
		if( allOdd(arr2) ) {
			System.out.println("arr2: all odd!");
		} else {
			System.out.println("arr2: all NOT odd!");
		}
		
		if( allOdd(arr3) ) {
			System.out.println("arr3: all odd!");
		} else {
			System.out.println("arr3: all NOT odd!");
		}
		
		if( allOdd(arr4) ) {
			System.out.println("arr4: all odd!");
		} else {
			System.out.println("arr4: all NOT odd!");
		}
		
	}
	
	// correct this code with an exception handler
	public static boolean allOdd(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=1) { // not odd
				return false; // one failure fails all
			}
		}
		return true; // must pass all iterations
	}
	
}
