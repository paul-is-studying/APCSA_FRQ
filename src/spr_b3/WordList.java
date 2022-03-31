package spr_b3;

import java.util.ArrayList;

public class WordList {
	
	private ArrayList<String> myList; // contains Strings made up of letters

	public WordList(ArrayList<String> list) {
		myList = list;
	}
	public String toString() {
		return myList.toString();
	}
	
	// postcondition: returns the number of words in this WordList that
	// are exactly len letters long
	public int numWordsOfLength(int len) {
		// to be implemented in part (a) 
		int count = 0;
		for (int i = 0; i<myList.size(); i++){
			if(myList.get(i).length() == len){
				count++;
			}
		}
		return count;
	}

	// postcondition: all words that are exactly len letters long
	// have been removed from this WordList, with the
	// order of the remaining words unchanged
	public void removeWordsOfLength(int len) {
		// to be implemented in part (b) 
		for (int i = 0; i<myList.size(); i++){
			if (myList.get(i).length() == len){
				myList.remove(i);
				i--; //or traverse the reverse.
			}
		}
		//nothing to return ; it is a void method

	}

	// ... constructor and other methods not shown
}
