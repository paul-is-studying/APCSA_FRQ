package spr_b4;

import java.util.ArrayList;
import java.util.Arrays;

public class Hotel {
	
	private Reservation[] rooms;
	// each element corresponds to a room in the hotel;
	// if rooms[index] is null, the room is empty;
	// otherwise, it contains a reference to the Reservation
	// for that room, such that
	// rooms[index].getRoomNumber() returns index
	
	private ArrayList<String> waitList;
	// contains names of guests who have not yet been
	// assigned a room because all rooms are full
	
	public Hotel(int n) { // hotel has n rooms
		// implementation not shown

	}
	public String toString() {
		return "Reservations:"
				+ Arrays.toString(rooms)
				+ "\nWaitlist:"+waitList;
	}
	public Reservation getReservation(String n) {
		// added for main()

		return null;
	}
	
	
	// if there are any empty rooms (rooms with no reservation),
	// then create a reservation for an empty room for the
	// specified guest and return the new Reservation;
	// otherwise, add the guest to the end of waitList
	// and return null
	public Reservation requestRoom(String guestName) {
		// to be implemented in part (a)
		boolean checkFin = false;
		if (rooms.length != 0) {
			for(int i = 0 ; i < (rooms.length-1) ; i++){
				if(rooms[i] == null){
					new Reservation(guestName,i);
					checkFin = true;
					break;
				}
			}
		}

		if(checkFin == false){
			waitList.add(guestName);
		}

		return null;
	}
	
	// release the room associated with parameter res, effectively
	// canceling the reservation;
	// if any names are stored in waitList, remove the first name
	// and create a Reservation for this person in the room
	// reserved by res; return that new Reservation;
	// if waitList is empty, mark the room specified by res as empty and
	// return null
	// precondition: res is a valid Reservation for some room
	// in this hotel
	public Reservation cancelAndReassign(Reservation res) {
		// to be implemented in part (b) 
		int roomNumber = res.getRoomNumber();
		boolean checkRoom = false;
		
		for(int i = 0 ; i < rooms.length-1 ; i++){
			if(rooms[i].getRoomNumber() == roomNumber){
				checkRoom = true;
				ArrayList<String> newArray = new ArrayList(Arrays.asList(rooms));
				newArray.remove(roomNumber);
				Reservation[] rooms = newArray.toArray(new Reservation[newArray.size()]);
				break;
			}
		}
		
		if(checkRoom == true){
			if(waitList == null){
				// Mark the room specified by res as empty
				return null;
			}else{
				String waitListPerson = waitList.get(0);
				waitList.remove(0);
				return new Reservation(waitListPerson,roomNumber);
			}
		}
		
		return null;
	}

	// constructors and other methods not shown
}
