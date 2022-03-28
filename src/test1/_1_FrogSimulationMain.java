package test1;

// Requires; FrogSimulation.java
public class _1_FrogSimulationMain {

	public static void main(String[] args) {

		FrogSimulation sim = new FrogSimulation(24, 5);
		
		// (a)
		for( int i=0; i<10; i++)  {
			System.out.println(sim.simulate());
		}
		
		// (b)
		System.out.println(sim.runSimulations(400));
		
	}

}
