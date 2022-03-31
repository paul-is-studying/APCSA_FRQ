package spr_b3;

import java.util.Arrays;

public class _03_ChangeIt3 {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3};
		
		System.out.println(Arrays.toString(arr));
		
		changeIt(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void changeIt(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = arr[i] * 2;
		}

	}


}
