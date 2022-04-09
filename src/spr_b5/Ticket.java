package spr_b5;

public abstract class Ticket {
	private static int refNum=0;
	private int serialNumber; // unique ticket id number

	public Ticket() {
		serialNumber = getNextSerialNumber();
	}

	// returns the price for this ticket
	public abstract double getPrice();

	// returns a string with information about the ticket
	public String toString() {
		return "Number: " + serialNumber + "\nPrice: " + getPrice();
	}

	// returns a new unique serial number
	private static int getNextSerialNumber() {
		// implementation not shown 
		return ++refNum;
	}
}
