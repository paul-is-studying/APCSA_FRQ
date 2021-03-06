package spr_b2;

public class ScoreInfo {
	private int score;
	private int numStudents;

	public ScoreInfo(int aScore) {
		score = aScore;
		numStudents = 1;
	}

	// adds 1 to the number of students who earned this score
	public ScoreInfo increment() {
		numStudents++;
		return null;
	}

	//@return this score
	public int getScore(){
		return score;
	}

	//@return the number of students who earned this score
	public int getFrequency() {
		return numStudents;
	}

	// added
	public String toString() {
		return score+"("+numStudents+")";
	}
}
