package spr_b4;

public class _42_Wraparound2 {

	public static void main(String[] args) {

		int[] arr = { 1,2,3,4 }; 
		int num = 10;
		
		// do the wraparound as before, but in reverse order.
		// i.e. 4 3 2 1 4 3 2 1 4 3
		
		int i=arr.length-1; // last num
		for(int j=0; j<num; j++) {
			System.out.print(arr[(i+arr.length*num)%arr.length]+" ");
			i--;
		}
		


	}

}
