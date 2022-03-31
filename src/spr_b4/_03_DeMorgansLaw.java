package spr_b4;

public class _03_DeMorgansLaw {

	public static void main(String[] args) {

		// variable declarations
		boolean p, q;

		
		// !(p && q) == !p || !q
		System.out.println("p\tq\t!(p&&q)\t!p||!q");
		System.out.println("================================");
		p = true;
		q = true;
		System.out.println(p+"\t"+q+"\t"+(!(p&&q))+"\t"+(!p||!q));
		p = true;
		q = false;
		System.out.println(p+"\t"+q+"\t"+(!(p&&q))+"\t"+(!p||!q));
		p = false;
		q = true;
		System.out.println(p+"\t"+q+"\t"+(!(p&&q))+"\t"+(!p||!q));
		p = false;
		q = false;
		System.out.println(p+"\t"+q+"\t"+(!(p&&q))+"\t"+(!p||!q));
			
		System.out.println();
		
		// !(p||q) == !p&&!q
		System.out.println("p\tq\t!(p||q)\t!p&&!q");
		System.out.println("======================");
		p = true;
		q = true;
		System.out.println(p+"\t"+q+"\t"+(!(p||q))+"\t"+(!p&&!q));
		p = true;
		q = false;
		System.out.println(p+"\t"+q+"\t"+(!(p||q))+"\t"+(!p&&!q));
		p = false;
		q = true;
		System.out.println(p+"\t"+q+"\t"+(!(p||q))+"\t"+(!p&&!q));
		p = false;
		q = false;
		System.out.println(p+"\t"+q+"\t"+(!(p||q))+"\t"+(!p&&!q));		

	}

}
