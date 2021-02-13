package com.lao.Inheritence;

public class Bmw extends Car {

	/*
	 * simplest form of inheritence ACCESS MODIFIER: 1. Default - when no access
	 * modifier is specified 2. private - only with in the class in which they are
	 * declared. 3. protected - with in same package/sub classes in different
	 * package 4. public - from everywhere in the program
	 */

	public static void main(String[] args) {

		Bmw bmw = new Bmw();
		bmw.engine();

	}

}
