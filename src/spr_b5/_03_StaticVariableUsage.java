package spr_b5;

public class _03_StaticVariableUsage {

	public static void main(String[] args) {
		Account a1 = new Account("John");
		System.out.println(a1);
		Account a2 = new Account("Troy");
		System.out.println(a2);
		for (int i = 0 ; i < 100 ; i++){
			new Account ("John Doe");

		}

		Account a3 = new Account("Joahn Doe");
		System.out.println(a3);
		
	}
	
	public static class Account {
		private static int ref = 0; // change this to non-static & see what happens
		private int id;
		private String name;
		public Account(String n) {
			name = n;
			ref++;
			id = ref;
		}
		public String toString() {return name+"("+id+")";}
	}

}
