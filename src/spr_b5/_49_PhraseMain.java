package spr_b5;

// Requires: Phrase.java
public class _49_PhraseMain {

	public static void main(String[] args) {
		
		// (prelim) findNthOccurrence test
		Phrase phrase0 = new Phrase("aaabbaa");
		for( int i=1; i<=9; i++) {
			System.out.print(phrase0.findNthOccurrence("aa", i)+"  ");
		}
		System.out.println();
		
		// (a)
		System.out.println("== (a) ===== ");
		Phrase phrase1 = new Phrase("A cat ate late.");
		phrase1.replaceNthOccurrence("at", 1, "rane");
		System.out.println(phrase1);
		
		Phrase phrase2 = new Phrase("A cat ate late.");
		phrase2.replaceNthOccurrence("at", 6, "xx");
		System.out.println(phrase2);
		
		Phrase phrase3 = new Phrase("A cat ate late.");
		phrase3.replaceNthOccurrence("bat", 2, "xx");
		System.out.println(phrase3);
		
		Phrase phrase4 = new Phrase("aaaa");
		phrase4.replaceNthOccurrence("aa", 1, "xx");
		System.out.println(phrase4);
		
		Phrase phrase5 = new Phrase("aaaa");
		phrase5.replaceNthOccurrence("aa", 2, "bbb");
		System.out.println(phrase5);
		
		// (b)
		Phrase phrase6 = new Phrase("A cat ate late.");
		System.out.println("== (b) ===== ");
		System.out.println("Should print 11, 2, -1");
		System.out.println( phrase6.findLastOccurrence("at") );
		System.out.println( phrase6.findLastOccurrence("cat") );
		System.out.println( phrase6.findLastOccurrence("bat") );
		
	}

}
