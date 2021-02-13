package com.lao.javalearning;

public class SuperHeroOrNot {
	
	String hero = "Captain America";
	
	public void heroOrNot(){
		
		switch (hero) {
		case "Captain America":
			System.out.println("Captain America is super hero");
			break;
		case "SuperMan":
			System.out.println("SuperMan is super hero");
			break;
		case "BatMan":
			System.out.println("BatMan is super hero");
			break;

		default:
			System.out.println(hero+ "is not a super hero");
		}
		
		
	}

	public static void main(String[] args) {
		
		
		SuperHeroOrNot heroOrNot = new SuperHeroOrNot();
		heroOrNot.heroOrNot();

	}

}
