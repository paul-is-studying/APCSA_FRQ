package spr_a1;

public class _29_MountainMain {

	// needs: Mountain.java
	public static void main(String[] args) {
	
		// testing isDecreasing and isIncreasing
		int[][] arr = {
				{1, 2, 3, 4, 5, 0},
				{1, 2, 3, 3, 4, 0},
				{0, 5, 4, 3, 3, 1},
				{0, 5, 4, 3, 2, 1}
		};
		System.out.println("Testing isIncreasing().. should get TFFF");
		for(int r=0; r<arr.length;r++) {
			System.out.print(Mountain.isIncreasing(arr[r], arr.length-1) + " ");
		}
		System.out.println();
		System.out.println("Testing isDecreasing().. should get FFFT");
		for(int r=0; r<arr.length;r++) {
			System.out.print(Mountain.isDecreasing(arr[r], 1) + " ");
		}
		System.out.println();
		
		// (a)
		int[][] arr1 = {
				{11, 22, 33, 22, 11},
				{11, 22, 11, 22, 11},
				{11, 22, 33, 55, 77},
				{99, 33, 55, 77, 120},
				{99, 33, 55, 77, 55},
				{33, 22, 11}
		};
		System.out.println("Testing (a).. should get 2 1 -1 -1 3 -1");
		for(int r=0; r<arr1.length;r++) {
			System.out.print(Mountain.getPeakIndex(arr1[r]) + " ");
		}
		System.out.println();
		
		// (b)
		int[][] arr2 = {
				{1, 2, 3, 2, 1},
				{1, 2, 1, 2, 1},
				{1, 2, 3, 1, 5},
				{1, 4, 2, 1, 0},
				{9, 3, 5, 7, 5},
				{3, 2, 1}
		};
		System.out.println("Testing (b).. should get T F F T F F");
		for(int r=0; r<arr2.length;r++) {
			System.out.print(Mountain.isMountain(arr2[r]) + " ");
		}
	}

}
