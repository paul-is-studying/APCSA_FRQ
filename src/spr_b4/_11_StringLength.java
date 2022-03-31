package spr_b4;

public class _11_StringLength {

	public static void main(String[] args) {
		
		String str = "HowLongIsThisString";
		
		// find the length of the string str
		int len = str.length();
		System.out.println(str + "\n=> " + len + " characters long.");
		
		
		// .substring(k, k+1) : character at index k
		int k = 2;
		String kth = str.substring(k, k+1);
		System.out.println( k + "th char of " + str + ": " + kth);
		
		// do not use charAt(k), use substring(k,k+1) instead.
		
	}

}
