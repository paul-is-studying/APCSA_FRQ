package spr_a1;

public class HorseBarn {
	/** The spaces in the barn. Each array element holds a reference to the horse
	* that is currently occupying the space. A null value indicates an empty space.
	*/
	private Horse[] spaces;
	/** Returns the index of the space that contains the horse with the specified name.
	* Precondition: No two horses in the barn have the same name.
	* @param name the name of the horse to find
	* @return the index of the space containing the horse with the specified name;
	* -1 if no horse with the specified name is in the barn.
	*/
	public HorseBarn(int n) {
		spaces = new Horse[n];
	}
	public void addHorse(int n, String name, int weight) {
		spaces[n] = new Horse(name, weight);
	}
	public int findHorseSpace(String name){   
		// TODO: to be implemented in part (a)  

		return 0;
	}

	/** Consolidates the barn by moving horses so that the horses are in adjacent spaces,
	* starting at index 0, with no empty space between any two horses.
	* Postcondition: The order of the horses is the same as before the consolidation.
	*/
	public void consolidate() { 
		// TODO: to be implemented in part (b) 

	}

	// is this print() correct?
	public void print() {
		for( int i=0; i<spaces.length; i++) {
			String name = spaces[i].getName();
			int weight = spaces[i].getWeight();
			System.out.println("Barn " + i + ": " + name + "(" + weight + ")");
		}
	}

}
