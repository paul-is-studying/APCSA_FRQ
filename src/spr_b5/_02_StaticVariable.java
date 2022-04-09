package spr_b5;

public class _02_StaticVariable {

	public static void main(String[] args) {
		

		
	}
	
	public static class Account {
		private static int num = 0; // change this to non-static & see what happens
		public void incr() {num++;}
		public String toString() {return "("+num+")";}
	}

}
