package spr_b4;

public class _15_StringComparison {

	public static void main(String[] args) {
		
		// care is needed when comparing strings
		
		// case 1
		if ( "AA" == "AA" ) {
			System.out.println("Yes!");
		} else {
			System.out.println("No!");
		}
		
		// case 2
		String a1 = "AA";
		String a2 = "AA";
		if ( a1 == a2 ) {
			System.out.println("Yes!");
		} else {
			System.out.println("No!");
		}
		
		// case 3
		a1 = "AA";
		a2 = new String("AA");
		if ( a1 == a2 ) {
			System.out.println("Yes!");
		} else {
			System.out.println("No!");
		}
		// then how do you compare strings?
		if ( a1.equals(a2) ) {
			System.out.println("Yes!");
		} else {
			System.out.println("No!");
		}
		
		
		// Bottom line: 
		// When comparing strings, use .equals()
		// String1.equals(String2)
		
	}

}
