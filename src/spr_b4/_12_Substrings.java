package spr_b4;

public class _12_Substrings {

	public static void main(String[] args) {
		
		String str = "abcdefghij";
		
		// substring() can be used to extract more than a single character
		// substring( k, k+m ) : m characters from k
		// NOTE: substring(a, b) contains the char at index a, but not the char at index b
		// also: substring(k) : everything from k to the end
		
		// de
		System.out.println( str.substring(3,5) );
		// fghij
		System.out.println( str.substring(5) );
		System.out.println( str.substring(5,10) );
		// last character
		System.out.println( str.substring(str.length()-1) );
		// last 3 characters
		System.out.println( str.substring(str.length()-3) );
		// entire string
		System.out.println( str.substring(0, str.length()) );
		// after the last character
		System.out.println( str.substring(str.length()-1, str.length()) );
		System.out.println( str.substring(str.length(), str.length()) ); // null string
		System.out.println( str.substring(str.length(), str.length()+1) ); // RTE
		
		
	}

}
