package test2;

public class LightBoard {
	
	/** The lights on the board, where true represents on and false represents off.
	*/
	private boolean[][] lights;
	
	/** Constructs a LightBoard object having numRows rows and numCols columns.
	* Precondition: numRows > 0, numCols > 0
	* Postcondition: each light has a 40% probability of being set to on.
	*/
	public LightBoard(int numRows, int numCols){ 
		// to be implemented in part (a) 
		lights = new boolean[numRows][numCols];
		for (int r = 0; r < numRows; r++){
			for (int c = 0 ; c<lights[0].length ; c++){
				if(Math.random() < 0.4){
					lights[r][c] = true;
				}else{
					lights[r][c] = false;
				}
			}
		}
		
	}
	
	/** Evaluates a light in row index row and column index col and returns a status
	* as described in part (b).
	* Precondition: row and col are valid indexes in lights.
	*/
	public boolean evaluateLight(int row, int col) {  
		// to be implemented in part (b) 
		int count = 0;
		for (int r = 0 ; r < lights.length; r++){
			if(lights[r][col]){
					count++;
			}
		}
		if(lights[row][col]){
			if(count%2==0){
				return false;
			}
		}else{
			if (count % 3 == 0) {
				return true;
			}
		}
		
		return lights[row][col];
	}
	
	// There may be additional instance variables, constructors, and methods not shown.
	public void print() {
		for ( int r=0; r<lights.length; r++ ) {
			System.out.print("|");
			for ( int c=0; c<lights[0].length-1; c++) {
				System.out.print(lights[r][c]?"T"+"\t":"F"+"\t");
			}
			System.out.print(lights[r][lights[0].length-1]?"T":"F");
			System.out.println("|");
		}
		int on = 0;
		int num = 0;
		for ( int r=0; r<lights.length; r++ ) {
			for ( int c=0; c<lights[0].length; c++) {
				num++;
				if(lights[r][c]) on++;
			}
		}
		System.out.println("Proportion of ON : "+(double)on/num);
		System.out.println();
	}
}
