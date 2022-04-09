package spr_a1;

public class _01_RecursionIntro {
	
	public static void main(String[] args) {

		// recursion : a method calling itself.
		mystery();

		// making recursion stop requires two components: a variable and a condition.
		makeitstop(5);
		
	}
	
	public static void mystery() {
		System.out.println("mystery1!");
		mystery();
	}
	
	// code makeitstop so it stops after printing 'stop!' five times.
	public static void makeitstop(int n) { // n: variable
		System.out.println("stop!");
		makeitstop(n);
	}

}
