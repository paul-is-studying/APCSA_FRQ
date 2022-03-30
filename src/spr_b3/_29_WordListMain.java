package spr_b3;

import java.util.ArrayList;

// requires: WordList.java
public class _29_WordListMain {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("mouse");
		list.add("frog");
		list.add("dog");
		list.add("dog");
		WordList animals = new WordList(list);
		System.out.println(animals);
		
		// (a)
		System.out.println("===(a)===================");
		System.out.println("should print 1, 3, 0");
		System.out.println(animals.numWordsOfLength(4));
		System.out.println(animals.numWordsOfLength(3));
		System.out.println(animals.numWordsOfLength(2));
		
		// (b)
		System.out.println("===(b)===================");
		System.out.println(animals);
		animals.removeWordsOfLength(4);
		System.out.println(animals);
		animals.removeWordsOfLength(3);
		System.out.println(animals);
		animals.removeWordsOfLength(2);
		System.out.println(animals);

		
	}

}
