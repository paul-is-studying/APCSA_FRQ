package spr_b2;

import java.util.ArrayList;

public class _09_FEL_Misusage2 {

	public static void main(String[] args) {

		ArrayList<Point> list = new ArrayList<Point>();
		list.add(new Point(1,1));
		list.add(new Point(2,2));
		list.add(new Point(3,3));
		
		System.out.println(list);
		
		// find the total sum of x coords only
		int total = 0;
		for(Point p : list) {

			// TODO: complete code here
			
		}
		System.out.println(total);
		
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
