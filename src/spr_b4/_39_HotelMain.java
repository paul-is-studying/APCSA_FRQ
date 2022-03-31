package spr_b4;

// Requires: Hotel.java, Reservation.java
public class _39_HotelMain {

	public static void main(String[] args) {
		
		// (a)
		System.out.println("===(a)=================");
		Hotel h = new Hotel(3);
		System.out.println(h);
		h.requestRoom("Gandalf");
		System.out.println(h);
		h.requestRoom("Aragorn");
		System.out.println(h);
		h.requestRoom("Legolas");
		System.out.println(h);
		h.requestRoom("Gimle");
		System.out.println(h);

		// (b)
		System.out.println("===(b)=================");
		System.out.println(h);
		h.cancelAndReassign(h.getReservation("Aragorn"));
		System.out.println(h);
		h.cancelAndReassign(h.getReservation("Gandalf"));
		System.out.println(h);

	}

}
