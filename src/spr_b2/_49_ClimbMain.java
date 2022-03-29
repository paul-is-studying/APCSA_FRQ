package spr_b2;

// requires: ClimbInfo.java, ClimbingClub.java
public class _49_ClimbMain {

	public static void main(String[] args) {
		ClimbingClub hikerClub = new ClimbingClub();
		hikerClub.addClimbA("Monadnock", 274);
		hikerClub.addClimbA("Whiteface", 301);
		hikerClub.addClimbA("Algonquin", 225);
		hikerClub.addClimbA("Monadnock", 344);
		System.out.println("FIFO");
		System.out.println(hikerClub);
		System.out.println("Distinct Peak Names: "+hikerClub.distinctPeakNames());

		ClimbingClub sortedClub = new ClimbingClub();
		sortedClub.addClimbB("Monadnock", 274);
		sortedClub.addClimbB("Whiteface", 301);
		sortedClub.addClimbB("Algonquin", 225);
		sortedClub.addClimbB("Monadnock", 344);
		System.out.println("Sorted");
		System.out.println(sortedClub);
		System.out.println("Distinct Peak Names: "+sortedClub.distinctPeakNames());
	}

}
