package spr_b3;

public class _04_ChangeIt4 {

	public static void main(String[] args) {

		Point p = new Point(1,2);

		System.out.println(p);
		
		changeIt(p);
		
		System.out.println(p);
		
	}

	private static void changeIt(Point p) {


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


}
