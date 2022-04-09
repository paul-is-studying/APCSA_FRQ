package spr_b5;

import java.util.Arrays;

public class StudentRecord {
	private int[] scores; // contains scores.length values
	// scores.length > 1
	// constructors and other data fields not shown
	// returns the average (arithmetic mean) of the values in scores
	// whose subscripts are between first and last, inclusive
	// precondition: 0 <= first <= last < scores.length
	public StudentRecord(int[] r) {
		scores = r;
	}
	public String toString() {
		return "\n"+Arrays.toString(scores)
				+"\nImproved? "+(hasImproved()?"Yes":"No")
				+"\nFinal Average: "+finalAverage();
	}
	
	public double average(int first, int last) { // made public for tests purposes
		// to be implemented in part (a) 
		double total = 0;
		int count = 0;
		for(int i = first; i <= last ; i++){
			total += scores[i];
			count++;
		}
		return total/(last-first+1);
	}

	// returns true if each successive value in scores is greater
	// than or equal to the previous value;
	// otherwise, returns false
	public boolean hasImproved() { // made public for test purposes
		// to be implemented in part (b)
		for (int i = 0; i <scores.length-1;i++){
			if(scores[i]>scores[i+1]){
				return false;
			}
		}
		return true;
	}

	// if the values in scores have improved, returns the average
	// of the elements in scores with indexes greater than or equal
	// to scores.length/2;
	// otherwise, returns the average of all of the values in scores
	public double finalAverage() {
		// to be implemented in part (c)  
		if(hasImproved()){
			return average(scores.length/2,scores.length-1);
		}else{
			return average(0,scores.length-1);
		}

		return 0;
	}
}
