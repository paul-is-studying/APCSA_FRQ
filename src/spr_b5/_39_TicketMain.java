package spr_b5;

// Requires: Ticket.java, Advance.java, StudentAdvance.java
public class _39_TicketMain {

	public static void main(String[] args) {
		

		Ticket t3 = new StudentAdvance(5);
		System.out.println(t3);
		
		for(int i=0; i<132; i++) {
			t3 = new StudentAdvance(1);
		}
		
		Ticket t4 = new StudentAdvance(15);
		System.out.println(t4);
		
		for(int i=0; i<222; i++) {
			t4 = new StudentAdvance(1);
		}
		
		Ticket t1 = new Advance(5);
		System.out.println(t1);
		
		Ticket t2 = new Advance(15);
		System.out.println(t2);

		
	}

}
