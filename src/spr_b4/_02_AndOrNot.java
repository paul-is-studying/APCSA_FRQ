package spr_b4;

public class _02_AndOrNot {

	public static void main(String[] args) {

		// variable declarations
		boolean p, q;
		
		// Not: !
		p = true;
		System.out.println("p: " + p );
		System.out.println("not p: "+ !p );
		
		// And: &&
		p = true;
		q = false;
		System.out.println("p AND q: " + (p && q) );
		System.out.println();
		
		// And truth table
		System.out.println("p\tq\tp&&q");
		System.out.println("======================");
		p = true;
		q = true;
		System.out.println(p+"\t"+q+"\t"+(p&&q));
		p = true;
		q = false;
		System.out.println(p+"\t"+q+"\t"+(p&&q));
		p = false;
		q = true;
		System.out.println(p+"\t"+q+"\t"+(p&&q));
		p = false;
		q = false;
		System.out.println(p+"\t"+q+"\t"+(p&&q));
		
		// OR: ||
		p = true;
		q = false;
		System.out.println("p OR q: " + (p || q) );
		System.out.println();
		
		// OR truth table
		System.out.println("p\tq\tp||q");
		System.out.println("======================");
		p = true;
		q = true;
		System.out.println(p+"\t"+q+"\t"+(p||q));
		p = true;
		q = false;
		System.out.println(p+"\t"+q+"\t"+(p||q));
		p = false;
		q = true;
		System.out.println(p+"\t"+q+"\t"+(p||q));
		p = false;
		q = false;
		System.out.println(p+"\t"+q+"\t"+(p||q));		

		// ** && has a higher precedence than ||
		
	}

}
