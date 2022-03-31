package spr_b3;

public class TemperatureGrid {
	/**
	 * A two-dimensional array of temperature values, initialized in the
	 * constructor (not shown) Guaranteed not to be null
	 */
	private double[][] temps;

	/**
	 * Computes and returns a new temperature value for the given location.
	 * 
	 * @param row
	 *            a valid row index in temps
	 * @param col
	 *            a valid column index in temps
	 * @return the new temperature for temps[row][col] - The new temperature for
	 *         any element in the border of the array is the same as the old
	 *         temperature. - Otherwise, the new temperature is the average of
	 *         the four adjacent entries. Postcondition: temps is unchanged.
	 */
	// turned public for demonstration purposes.
	public double computeTemp(int row, int col) {
		// to be implemented in part (a) 
		if(row==0||col==0||row==temps.length-1||col==temps[0].length-1){
			return temps[row][col];
		}else{
			double total = 0;
			total += temps[row-1][col];
			total += temps[row+1][col];
			total += temps[row][col-1];
			total += temps[row][col+1];
			return (double)total/4;
		}
	}

	/**
	 * Updates all values in temps and returns a boolean that indicates whether
	 * or not all the new values were within tolerance of the original values.
	 * 
	 * @param tolerance
	 *            a double value >= 0
	 * @return true if all updated temperatures are within tolerance of the
	 *         original values; false otherwise. Postcondition: Each value in
	 *         temps has been updated with a new value based on the
	 *         corresponding call to computeTemp.
	 */
	public boolean updateAllTemps(double tolerance) {
		// to be implemented in part

		boolean within = true;
		for (int r = 0 ; r<temps.length;r++){
			for ( int c = 0 ; c <temps[0].length;c++){
				double newval = computeTemp(r,c);
				if(Math.abs(newval - temps[r][c]) > tolerance){
					return false;
				}
				temps[r][c] = newval;

			}
		}

		return within;
	}
	
	// There may be instance variables, constructors, and methods that are not shown.
	public TemperatureGrid(double[][] d) {
		temps = d;
	}
	public void print() {
		for(int r=0; r<temps.length; r++) {
			for(int c=0; c<temps[0].length; c++) {
				System.out.print(temps[r][c] + "\t");
			}
			System.out.println();
		}
	}
}