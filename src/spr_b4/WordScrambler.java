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
		int wordOneLength = 0;
		int wordTwoLength = 0;

		wordOneLength = word1.length();
		wordTwoLength = word2.length();

		return word1.substring(0,wordOneLength/2) + word2.substring(wordTwoLength/2,wordTwoLength);
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
		int arrayLength = words.length;
		String[] mixed = new String[arrayLength];
		if(arrayLength % 2 == 1){
			System.out.println("This test case is inappropriate.");
		}else{
			for(int i = 0 ; i < arrayLength ; i+=2){
				mixed[i] = recombine(words[i],words[i+1]);
				mixed[i+1] = recombine(words[i+1],words[i]);
			}
		}
		return mixed;
	}
	
	// There may be instance variables, constructors, and methods that are not shown.
	public void print() {
		System.out.println(Arrays.toString(scrambledWords));
	}
	
}
