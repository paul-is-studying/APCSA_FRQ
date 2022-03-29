package spr_b2;

public class _14_Inheritance_SuperConstructor {

	public static void main(String[] args) {

		Parent p1 = new Parent();
		Parent p2 = new Parent(2);
		
		// 1. default constructor is inherited
		// overloaded constructors are NOT inherited
		// so must be created manually in the subclass
		Child c1 = new Child();
		/* illegal until child defines an overloaded constructor
		Child c2 = new Child(10);
		*/
//		Child c2 = new Child(10);
		
		// 2. super() is implicit in ALL subclass constructors
		// 3. calling super(n); overrides implicit super();
		// 4. calling super(); MUST occur at the first line.
		
	}
	
	public static class Parent {
		public Parent() {
			System.out.println("Parent default");
		}
		public Parent(int n) {
			System.out.println("Parent "+n);
		}
	}
	
	public static class Child extends Parent {

	}
	
	
}
