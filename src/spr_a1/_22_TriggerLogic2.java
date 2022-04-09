package spr_a1;

public class _22_TriggerLogic2 {
	
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
	
	// write the correct code:
	public static boolean allOdd(int[] arr) {

		return false;
	}
	
}
