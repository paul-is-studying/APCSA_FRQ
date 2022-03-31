package spr_b4;

import java.util.Arrays;

public class WordScrambler {
	
	private String[] scrambledWords;

	/**
	 * @param wordArr an array of String objects Precondition: wordArr.length is even
	 */
	public WordScrambler(String[] wordArr) {
		scrambledWords = mixedWords(wordArr);
	}

	/**
	 * @param word1 a String of characters
	 * @param word2 a String of characters
	 * @return a String that contains the first half of word1 and the second
	 *         half of word2
	 */
	// changed from private for demonstration purposes
	public String recombine(String word1, String word2) { 
		// (a)

		return "";	
	}

	/**
	 * @param words
	 *            an array of String objects Precondition: words.length is even
	 * @return an array of String objects created by recombining pairs of
	 *         strings in array words Postcondition: the length of the returned
	 *         array is words.length
	 */
	// changed from private for demonstration purposes
	public String[] mixedWords(String[] words) {
		// (b)
		
		return null;
	}
	
	// There may be instance variables, constructors, and methods that are not shown.
	public void print() {
		System.out.println(Arrays.toString(scrambledWords));
	}
	
}
