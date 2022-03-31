package spr_b4;

public class _04_Distributive {

	public static void main(String[] args) {

		// associative (a ¡¿ b) ¡¿ c = a ¡¿ (b ¡¿ c)
		// commutative  a + b = b + a
		// distributive a ¡¿ (b + c)  =  a ¡¿ b  +  a ¡¿ c
		
		// variable declarations
		boolean p, q, r;

		
		// p && ( q || r ) === (p&&q) || (p&&r)
		System.out.println("p\tq\tr\t(p&&(q||r))\t((p&&q)||(p&&r))");
		System.out.println("==========================================================");
		p = true;
		q = true;
		r = true;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p&&(q||r))+"\t\t"+((p&&q)||(p&&r)) );
		p = true;
		q = true;
		r = false;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p&&(q||r))+"\t\t"+((p&&q)||(p&&r)) );
		p = true;
		q = false;
		r = true;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p&&(q||r))+"\t\t"+((p&&q)||(p&&r)) );
		p = true;
		q = false;
		r = false;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p&&(q||r))+"\t\t"+((p&&q)||(p&&r)) );
		p = false;
		q = true;
		r = true;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p&&(q||r))+"\t\t"+((p&&q)||(p&&r)) );
		p = false;
		q = true;
		r = false;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p&&(q||r))+"\t\t"+((p&&q)||(p&&r)) );
		p = false;
		q = false;
		r = true;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p&&(q||r))+"\t\t"+((p&&q)||(p&&r)) );
		p = false;
		q = false;
		r = false;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p&&(q||r))+"\t\t"+((p&&q)||(p&&r)) );
			
		System.out.println();
		
		// p || ( q && r ) === (p||q) && (p||r)
		System.out.println("p\tq\tr\t(p||(q&&r))\t((p||q)&&(p||r))");
		System.out.println("==========================================================");
		p = true;
		q = true;
		r = true;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p||(q&&r))+"\t\t"+((p||q)&&(p||r)) );
		p = true;
		q = true;
		r = false;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p||(q&&r))+"\t\t"+((p||q)&&(p||r)) );
		p = true;
		q = false;
		r = true;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p||(q&&r))+"\t\t"+((p||q)&&(p||r)) );
		p = true;
		q = false;
		r = false;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p||(q&&r))+"\t\t"+((p||q)&&(p||r)) );
		p = false;
		q = true;
		r = true;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p||(q&&r))+"\t\t"+((p||q)&&(p||r)) );
		p = false;
		q = true;
		r = false;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p||(q&&r))+"\t\t"+((p||q)&&(p||r)) );
		p = false;
		q = false;
		r = true;
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p||(q&&r))+"\t\t"+((p||q)&&(p||r)) );
		p = false;
		q = false;
		r = false;	
		System.out.println( p+"\t"+q+"\t"+r+"\t"+(p||(q&&r))+"\t\t"+((p||q)&&(p||r)) );
		
		
	}

}
