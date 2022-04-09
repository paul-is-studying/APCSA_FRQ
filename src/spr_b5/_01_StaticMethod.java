package spr_b5;

public class _01_StaticMethod {

	public static void main(String[] args) {

		
	}
	
	public static class Account {
		public static void m1() {
			System.out.println("This is a static method!");
		}
		public void m2() {
			System.out.println("This is a dynamic method!");
		}
	}

}
