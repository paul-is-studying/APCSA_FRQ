package spr_b2;

// requires: Stats.java, ScoreInfo.java
public class _39_StatsMain {

	public static void main(String[] args) {
		
		// (a)
		System.out.println("Testing (a).. should get [55(2), 60(1)]");
		Stats st1 = new Stats();
		st1.print();
		st1.record(55);
		st1.record(60);
		st1.record(55);
		st1.print();
		
		// (b)
		System.out.println("Testing (b).. should get [95(1), 97(1), 98(3), 99(2), 100(1)]");
		Stats st2 = new Stats();
		int[] arr = { 99, 100, 97, 98, 95, 99, 98, 98 };
		st2.recordScores(arr);
		st2.print();

	}

}
