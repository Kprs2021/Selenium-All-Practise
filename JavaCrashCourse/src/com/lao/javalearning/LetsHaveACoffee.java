package com.lao.javalearning;

public class LetsHaveACoffee {
	
	//Data Type - Boolean - It will return true or false.
	
	boolean isCupEmpty=true; 
	//boolean default data type is always false.

	public static void main(String[] args) {
		
		LetsHaveACoffee coffee = new LetsHaveACoffee();
		
		if(coffee.isCupEmpty) {
			
			System.out.println("fill the cup");
				
		}else {
			
			System.out.println("drink the coffee");
			
		}
		
	}

}
