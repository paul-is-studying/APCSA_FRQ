package spr_b4;

public class _43_Clock {

	public static void main(String[] args) {
		
		// set the clock to 1:50
		_43_Clock c = new _43_Clock(1,50);
		
		int num = 100;
		// print all the minutes from 1:51 to 3:30 (100 mins)
		for(int i=0; i<num; i++) {
			c.increaseMin();
			System.out.println(c);
		}
		
	}
	
	// write the method increaseMin() so that the main() works as intended
	private int hr, min;
	public _43_Clock(int h, int m) {
		hr=h;
		min=m;
	}
	public void increaseMin() {
		// implement this
		
	}
	public String toString() {
		return hr+":"+min;
	}

}
