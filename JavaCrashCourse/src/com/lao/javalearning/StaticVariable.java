package com.lao.javalearning;

public class StaticVariable {
	
	/*
	 * Example to show, static variable are shared among objects.
	 * 1. common to all the instances(means classes) (or Objects) of the class because
	 * it's a class level variable
	 * 2. only in a single copy of static variable is created and
	 * shared among all the instances of the class.
	 */
	
	static int accountBalance=0;
	String depositedByString;
	

	public static void main(String[] args) {
		
		accountBalance=500;
		
		StaticVariable object1 = new StaticVariable();
		object1.accountBalance=1000;
		object1.depositedByString="Karthik";
		
		StaticVariable object2 = new StaticVariable();
		object2.accountBalance=1500;
		object2.depositedByString="Vinoth";
		
		StaticVariable object3 = new StaticVariable();
		object3.accountBalance=2000;
		object3.depositedByString="Ganesh";
		
		System.out.println("object1 integer:"+ object1.accountBalance);
		System.out.println("object1 string:"+ object1.depositedByString);
		
		System.out.println("object2 integer:"+ object2.accountBalance);
		System.out.println("object2 string:"+ object2.depositedByString);
		
		System.out.println("object3 integer:"+ object3.accountBalance);
		System.out.println("object3 string:"+ object3.depositedByString);
	}

}
