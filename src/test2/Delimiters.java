package test2;

import java.util.ArrayList;

public class Delimiters {
	/** The open and close delimiters. */
	private String openDel;
	private String closeDel;
	
	/** Constructs a Delimiters object where open is the open delimiter and close is the
	* close delimiter.
	* Precondition: open and close are non-empty strings.
	*/
	public Delimiters(String open, String close) {
		openDel = open;
		closeDel = close;
	}
	
	/** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
	public ArrayList<String> getDelimitersList(String[] tokens) { 
		// to be implemented in part (a) 
		ArrayList<String> ret = new ArrayList<String>();
		for (int i = 0; i<tokens.length;i++){
			if(tokens[i].equals(openDel) || tokens[i].equals(closeDel)){
				ret.add(tokens[i]);
			}
		}
		return ret;
	}
	
	/** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
	* Precondition: delimiters contains only valid open and close delimiters.
	*/
	// running count algorithm
	public boolean isBalanced(ArrayList<String> delimiters){
		int op = 0, cl = 0;
		for(int i = 0; i<delimiters.size(); i++){
			String del = delimiters.get(i);
			if(del.equals(openDel)){
				op++;
			}
			if(del.equals(closeDel)) {
				cl++;
			}
			if(cl>op){
				return false;
			}
		}
		if (op == cl) {
			return true;
		}
		return false;
	}

	
	// There may be instance variables, constructors, and methods that are not shown.
	
}
