package spr_b4;

public class Reservation {
	private String guestName;
	private int roomNumber;
	public Reservation(String guestName, int roomNumber) {
		// implementation not shown 
		this.guestName = guestName;
		this.roomNumber = roomNumber;
	}
	public int getRoomNumber() {
		// implementation not shown 
		return roomNumber;
	}
	// private data and other methods not shown
	public String getGuestName() {
		return guestName;
	}
	public String toString() {
		return guestName+"("+roomNumber+")";
	}
}
