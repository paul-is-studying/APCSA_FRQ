package spr_b4;

public class _05_CommutativityVsSCE {

	public static void main(String[] args) {

		// associative (a ¡¿ b) ¡¿ c = a ¡¿ (b ¡¿ c)
		// commutative  a + b = b + a
		// distributive a ¡¿ (b + c)  =  a ¡¿ b  +  a ¡¿ c
		
		// variable declarations
		boolean p, q;

		// (p && q) == (q && p)
		System.out.println("p\tq\t!(p && q)\t(q && p)");
		System.out.println("=========================================");
		p = true;
		q = true;
		System.out.println(p+"\t"+q+"\t"+(p && q)+"\t\t"+(q && p));
		p = true;
		q = false;
		System.out.println(p+"\t"+q+"\t"+(p && q)+"\t\t"+(q && p));
		p = false;
		q = true;
		System.out.println(p+"\t"+q+"\t"+(p && q)+"\t\t"+(q && p));
		p = false;
		q = false;
		System.out.println(p+"\t"+q+"\t"+(p && q)+"\t\t"+(q && p));
			
		System.out.println();
		
		// (p || q) == (q || p)
		System.out.println("p\tq\t!(p || q)\t(q || p)");
		System.out.println("=========================================");
		p = true;
		q = true;
		System.out.println(p+"\t"+q+"\t"+(p || q)+"\t\t"+(q || p));
		p = true;
		q = false;
		System.out.println(p+"\t"+q+"\t"+(p || q)+"\t\t"+(q || p));
		p = false;
		q = true;
		System.out.println(p+"\t"+q+"\t"+(p || q)+"\t\t"+(q || p));
		p = false;
		q = false;
		System.out.println(p+"\t"+q+"\t"+(p || q)+"\t\t"+(q || p));
		
		// it would appear that p && q === q && p
		// but SCE makes it different. 
		// to be continued in the next file..
	}

}
