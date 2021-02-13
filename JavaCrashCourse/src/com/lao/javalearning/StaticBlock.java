package com.lao.javalearning;

public class StaticBlock {
	
	//class can have multiple static blocks..
	//it will execute one by one after then only it will execute the main 
	//method
	/*
	 * Static Block:
	 * 1. initializing the static variables.
	 * 2. gets executed when the class is loaded in the memory.
	 * 3. can have multiple static blocks, execution in written order
	 * Example: write a program with single and multi static block
	 */
	static{
		
		System.out.println("Inside static block1");
		
	}
	
	static{
		
		System.out.println("Inside static block2");
		
	}
	


	public static void main(String[] args) {
		
		System.out.println("Inside static block");

	}

}
