package spr_b2;

import java.util.ArrayList;

public class Kennel {
	
	private ArrayList<Pet> petList; // all elements are references to Pet objects

	public Kennel(ArrayList<Pet> pl) {
		petList = pl;
	}
	
	
	// postcondition: for each Pet in the kennel, its name followed
	// by the result of a call to its speak method
	// has been printed, one line per Pet
	public void allSpeak() {
		// to be implemented in part (c)
		String petName = "";
		String petReturn = "";
		for(Pet p : petList){
			petName = p.getName();
			petReturn = p.speak();
			System.out.println(petName+": "+petReturn);
		}
		
	}
	
	// ... constructor and other methods not shown
}
