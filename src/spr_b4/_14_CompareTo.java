package spr_b4;

public class _14_CompareTo {

	public static void main(String[] args) {
		
		// every character has an innate numerical value (ASCII code)
		char ch = 'a';
		System.out.println( (int) ch );
		System.out.println( (char) 97  );
		
		// .compareTo() is a string method that returns an integer value
		// this value represents the relative value(order) of two strings
		// A.compareTo(B) ==> A - B ( in terms of ASCII )
		
		String a = "a";
		String b = "b";
		System.out.println( "a-b: " + a.compareTo(b) ); 
		System.out.println( "b-a: " + b.compareTo(a) ); 
		
		// if first characters are the same, compareTo looks at the next pair
		String abb = "abb";
		String abc = "abc";
		System.out.println( abb.compareTo(abc) ); 
		
		// can also be used instead of .equals()
		String aa1 = "AA";
		String aa2 = new String("AA");
		if( aa1.compareTo(aa2)==0 ) {
			System.out.println("Same!");
		}
		
		
	}


}
