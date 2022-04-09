package test2;

import java.util.ArrayList;

// Requires: Delimiters.java
public class _3_DelimitersMain {

	public static void main(String[] args) {
		
		// (a)
		String openDel, closeDel;
		Delimiters d;
		
		openDel = "(";
		closeDel = ")";
		String[] tokens1 = { "(", "x+y", ")", " * 5" };
		d = new Delimiters(openDel, closeDel);
		System.out.println( d.getDelimitersList(tokens1) ); // 
		
		openDel = "<q>";
		closeDel = "</q>";
		String[] tokens2 = { "<q>", "yy", "</q>", "zz", "</q>" };
		d = new Delimiters(openDel, closeDel);
		System.out.println( d.getDelimitersList(tokens2) );
		
		//(b)
		String s1 = "<sup>";
		String s2 = "</sup>";
		d = new Delimiters(s1, s2);
		
		// T F F F
		System.out.println("\n=== (b) ====== should return TFFF ");
		ArrayList<String> ex1 = new ArrayList<String>();
		ex1.add(s1); ex1.add(s1); ex1.add(s2); ex1.add(s1); ex1.add(s2); ex1.add(s2); 
		System.out.print(ex1+": ");
		System.out.println(d.isBalanced(ex1));
		
		ArrayList<String> ex2 = new ArrayList<String>();
		ex2.add(s1); ex2.add(s2); ex2.add(s2); ex2.add(s1); 
		System.out.print(ex2+": ");
		System.out.println(d.isBalanced(ex2));
		
		ArrayList<String> ex3 = new ArrayList<String>();
		ex3.add(s2); 
		System.out.print(ex3+": ");
		System.out.println(d.isBalanced(ex3));
		
		ArrayList<String> ex4 = new ArrayList<String>();
		ex4.add(s1); ex4.add(s1); ex4.add(s2); 
		System.out.print(ex4+": ");
		System.out.println(d.isBalanced(ex4));
		
	}

}
