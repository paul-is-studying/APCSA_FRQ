package spr_b2;

import java.util.ArrayList;

public class Stats {
	
	// listed in increasing score order; no two ScoreInfo objects contain the same score
	private ArrayList<ScoreInfo> scoreList;
	
	/**
	 * Records a score in the database, keeping the database in increasing score
	 * order. If no other ScoreInfo object represents score, a new ScoreInfo
	 * object representing score is added to the database; otherwise, the
	 * frequency in the ScoreInfo object representing score is incremented.
	 * 
	 * @param score
	 *            a score to be recorded in the list
	 * @return true if a new ScoreInfo object representing score was added to
	 *         the list; false otherwise
	 */
	public boolean record(int score) {
		// to be implemented in part (a)


		return true;
	}

	/**
	 * Records all scores in stuScores in the database, keeping the database in
	 * increasing score order
	 * 
	 * @param stuScores
	 *            an array of student test scores
	 */
	public void recordScores(int[] stuScores) {
		// to be implemented in part (b)


	}
	
	// There may be instance variables, constructors, and methods that are not shown.
	public Stats() {
		scoreList = new ArrayList<ScoreInfo>();
	}
	public void print() {
		System.out.println(scoreList);
	}
	
}
