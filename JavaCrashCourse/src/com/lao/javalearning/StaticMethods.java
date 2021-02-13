package com.lao.javalearning;

public class StaticMethods {
	
	/*
	 * Static  Keyword:
	 * Can be used with clas, variable, method and block.
	 * belong to the class instead of a specific instance,
	 * this means if you make a member static, you can access it
	 * without object..
	 * 
	 * example program (Static method): 
	 * create a static method and call it without object.
	 * Note: we can call static method from non static method but not otherwise
	 */
	
	public static void method1() {
		
		// we cannot call non static method in static method
//		Ex: nonStatic();
		System.out.println("static method");
		
	}
	
	public void nonStatic() {
//		we can call static method in non static method..
		//Ex: method1();
		System.out.println("static method2");
	}

	public static void main(String[] args) {
		
		method1();
		//nonStatic();
		

	}

}
