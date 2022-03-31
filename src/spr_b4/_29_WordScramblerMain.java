package spr_b4;

import java.util.Arrays;

// Requires: WordScrambler.java
public class _29_WordScramblerMain {

	public static void main(String[] args) {
		
		String[] words = {"apple", "pear", "this", "cat"};
		
		WordScrambler ws = new WordScrambler(words);
		
		// (a)
		System.out.println("Testing (a).. should get \"apar\" and \"peple\"");
		System.out.println(ws.recombine("apple", "pear"));
		System.out.println(ws.recombine("pear", "apple"));		
		
		// (b)
		System.out.println("Testing (b).. should get [apar, peple, that, cis]");
		System.out.println(Arrays.toString(ws.mixedWords(words)));
		
		
	}

}
