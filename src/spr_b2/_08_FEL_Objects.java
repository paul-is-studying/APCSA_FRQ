package spr_b2;

import java.util.Arrays;

public class _08_FEL_Objects {

	public static void main(String[] args) {

		Point[] arr = new Point[3];
		for(int i=0; i<3; i++) {
			arr[i] = new Point(i+1, i+1);
		}
		System.out.println(Arrays.toString(arr));
		
		// use method timesTwo(arr) to 
		// multiply the coodinates of each point in arr by 2
		timesTwo(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	// use a for each loop!!
	private static void timesTwo(Point[] arr) {
		for(Point p : arr){
			p.setX(p.getX()*2);
		}

	}

	public static class Point {
		private int x;
		private int y;
		public Point(int xx, int yy) { x=xx; y=yy; }
		public int getX() { return x; }
		public int getY() { return y; }
		public void setX(int xx) { x = xx; }
		public void setY(int yy) { y = yy; }
		public String toString() { return "("+x+","+y+")"; }
	}
	
	// 1-1. for each loops CAN change structures of object references!


}
