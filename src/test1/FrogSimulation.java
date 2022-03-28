package test1;

public class FrogSimulation {
	
	/** Distance, in inches, from the starting position to the goal. */
	private int goalDistance;
	/** Maximum number of hops allowed to reach the goal. */
	private int maxHops;

	/** Constructs a FrogSimulation where dist is the distance, in inches, from the starting
	* position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
	* Precondition: dist > 0; numHops > 0
	*/
	public FrogSimulation(int dist, int numHops) {
		goalDistance = dist;
		maxHops = numHops;
	}

	/** Returns an integer representing the distance, in inches, to be moved when the frog hops.
	*/
	private int hopDistance() {
		// implementation not shown 
		int min = -10;
		int max = 10;
		return min + (int)(Math.random() * ((max - min) + 1));
	}


	/** Simulates a frog attempting to reach the goal as described in part (a).
	* Returns true if the frog successfully reached or passed the goal during the simulation;
	* false otherwise.
	*/
	public boolean simulate() {
		// to be implemented in part (a)
		int pos = 0;
		for(int i = 0; i < maxHops; i++) {
			pos += hopDistance();
			if(pos >= goalDistance) {
				return true;
			}
			if (pos < 0) {
				return false;
			}
		}
		return false;
	}

	/** Runs num simulations and returns the proportion of simulations in which the frog
	* successfully reached or passed the goal.
	* Precondition: num > 0
	*/
	public double runSimulations(int num) {
		// to be implemented in part (b) 
		int s=0;
		for(int i = 0 ; i<num ; i++) {
			if(simulate()) {
				s++;
			}

		}
		return (double)s/num;
	}

}
