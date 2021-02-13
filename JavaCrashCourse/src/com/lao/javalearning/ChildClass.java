package com.lao.javalearning;

public class ChildClass extends ParentClass {
	
	
	ChildClass(){
		
		System.out.println("Child Constructor");
		
	}

	public static void main(String[] args) {
		
		ChildClass childclass = new ChildClass();
		System.out.println(childclass);
		
	}

}
