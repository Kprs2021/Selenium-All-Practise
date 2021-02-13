package com.lao.javalearning;

public class Animal {

	String animal_Name;
	String animal_Type;
	int animal_numbers;
	
	Animal(String Name,String Type,int Numbers){
		
		animal_Name = Name;
		animal_Type = Type;
		animal_numbers = Numbers;
	}
	
	public void sayAboutAnimal() {
		
		System.out.println("Animal name is"+animal_Name+ "and Animal type is"+animal_Type +"änd Animal numbers are" +animal_numbers);
		
	}
	

	public static void main(String[] args) {
		
		Animal animal1 = new Animal("Lion", "MenEater", 25);
		animal1.sayAboutAnimal();
		
		Animal animal2 = new Animal("bear", "MenEater", 15);
		animal2.sayAboutAnimal();
		
	}

}
