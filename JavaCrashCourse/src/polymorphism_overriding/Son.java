package polymorphism_overriding;

import polymorphism_overloading.Parents;

public class Son extends parents1 {

	/*
	 * This class is to illustrate method overriding with a practical example
	 */
	@Override
	public void marriage() {

		System.out.println("My Marriage My Rules");

	}

	public static void main(String[] args) {

		parents1 parents1 = new Son();
		/* ParentClass ref = new ChildClass(); - */
		parents1.properties();
		parents1.marriage();
	}
}