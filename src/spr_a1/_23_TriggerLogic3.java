package spr_a1;

public class _23_TriggerLogic3 {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 3, 5, 7, 9};
		int[] arr2 = {1, 3, 5, 8, 9};
		int[] arr3 = {2, 4, 6, 8, 10};
		
		// should print [ odd, NOT, NOT ]
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
		
	}
	
	// why is this code wrong?
	public static boolean allOdd(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=1) { 
				return false; 
			} else {
				return true;
			}
		}
		return true; 
	}
	
}
