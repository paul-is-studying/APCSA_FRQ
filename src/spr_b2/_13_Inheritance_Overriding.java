package spr_b2;

public class _13_Inheritance_Overriding {

	public static void main(String[] args) {

		// Overriding: redefining parent classes methods. Can be powerful, 
		// but may lead to confusion when calling overridden methods.
		// ** subclasses can access parent class's data and methods...
		// 1. methods: if overridden, use super.method() if not, just use method().
		Child c1 = new Child();
		c1.print();
//		c1.printChild();
		// 2. data: Respect Parents' privacy!!
		
	}
	
	public static class Parent {
		private String data;
		public Parent() {
			data = "Parent";
		}
		public void print() {
			System.out.println(data);
		}
	}
	
	public static class Child extends Parent {

	}
	
	
}
