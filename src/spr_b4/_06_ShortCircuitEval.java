package spr_b4;

import java.util.Arrays;

public class _06_ShortCircuitEval {
	
	public static void main(String[] args) {

		Point[] parr = new Point[10];
		for(int i=0; i<parr.length; i++) {
			parr[i] = new Point(i+1,i+1);
		}
		
		// 1. set to null all points from parr with x coords that are multiples of 3

		
		
		
		System.out.println(Arrays.toString(parr));
		
		// 2. set to null all points from parr with even y coords.


		
		System.out.println(Arrays.toString(parr));
		
	}
	
	public static class Point {
		private int x;
		private int y;
		public Point(int xx, int yy) { x=xx; y=yy; }
		public int getX() { return x; }
		public int getY() { return y; }
		public String toString() { return "("+x+","+y+")"; }
	}
	
}
