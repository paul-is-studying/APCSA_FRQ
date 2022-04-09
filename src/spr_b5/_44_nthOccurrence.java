package spr_b5;

public class _44_nthOccurrence {

	public static void main(String[] args) {
		
		String str = "ababbabbbab";
		
		// find the index of the nth occurrence of 'a' in str
		
		// expected: 0, 2, 5, 9, -1 
		for(int n=1; n<=5; n++) {
			System.out.println(nth(str,n));
		}

	}
	
	public static int nth(String str, int n) {
		// implementation not shown

		return 0;
	}

}
