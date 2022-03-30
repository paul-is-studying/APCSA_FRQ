package spr_b3;

// Requires: TemperatureGrid.java
public class _39_TemperatureGridMain {

	public static void main(String[] args) {
		
		double[][] arr = {
				{95.5, 100, 100, 100, 100, 110.3},
				{0, 50, 50, 50, 50, 0},
				{0, 40, 40, 40, 40, 0},
				{0, 20, 20, 20, 20, 0},
				{0, 0, 0, 0, 0, 0}
		};
		TemperatureGrid tg = new TemperatureGrid(arr);

		
		// (a)
		System.out.println("Testing (a).. should get 37.5, 47.5, 100.0, 60.0");
		System.out.print(tg.computeTemp(2, 3) + "\t");
		System.out.print(tg.computeTemp(1, 1) + "\t");
		System.out.print(tg.computeTemp(0, 2) + "\t");
		System.out.print(tg.computeTemp(1, 3) + "\n");
		
		// (b)
		System.out.println("Testing (b)...should get false on return");
		System.out.println("before update:");
		tg.print();
		System.out.println("after update:");
		System.out.println("return on updateAllTemps(0.01) : "+tg.updateAllTemps(0.01) );
		tg.print();
		System.out.println();
		
		
	}

}
