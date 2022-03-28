package test1;

// Requires: WordPair.java, WordPairList.java
public class _2_WordPairMain {

	public static void main(String[] args) {
		
		
		// (a)
		String[] wordNums = {"one", "two", "three"};
		WordPairList exampleOne = new WordPairList(wordNums);
		exampleOne.print();
		
		String[] phrase = {"the", "more", "the", "merrier"};
		WordPairList exampleTwo = new WordPairList(phrase);
		exampleTwo.print();
		
		// (b)
		String[] moreWords = {"the", "red", "fox", "the", "red"};
		WordPairList exampleThree = new WordPairList(moreWords);
		exampleThree.print();
		// should return 2
		System.out.println(exampleThree.numMatches());
		
	}

}
