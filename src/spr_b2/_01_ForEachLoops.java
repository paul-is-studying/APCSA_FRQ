package spr_b2;

public class _01_ForEachLoops {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		
		// a for loop
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// a for-each loop
		for(int num : arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		// for-loop analogue of a for-each loop
		for(int i=0; i<arr.length; i++) {
			int num = arr[i];
			System.out.print(num+" ");
		}
		System.out.println();
		
	}

}
