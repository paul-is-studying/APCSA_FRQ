package spr_b3;

public class _02_ChangeIt2 {

	public static void main(String[] args) {

		String str = "Hello ";
		
		System.out.println(str);
		
		changeIt(str);
		
		System.out.println(str);
		
	}

	private static void changeIt(String str) {
		str += "World!";

	}
	
	// how do you change it? use return values

}
