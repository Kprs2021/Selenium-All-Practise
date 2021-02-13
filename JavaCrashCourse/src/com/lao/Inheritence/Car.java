package com.lao.Inheritence;

public class Car {

	/*
	 * Inheritence: 1. Inheritence meansProcess of acquiring the properties
	 * (Data+Methods) The one which takes - child Class The one which gives - parent
	 * class Note: A child can be a parent of another class A parent can be a child
	 * of another class
	 * 
	 * How to inherit? Using Extends keywords IS-A Relationship Types of
	 * Inheritence: 1. Single Inheritence: A->B 2. Multi level: A->B->C 3. Multiple:
	 * A+B->C (Not supported in java) 4. Heirarchial: A->B,A->C,A->D
	 */

	public int wheels = 4;

	public void engine() {

		System.out.println("This is my engine secret");

	}

}
