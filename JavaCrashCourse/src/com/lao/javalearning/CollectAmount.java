package com.lao.javalearning;


//Java = Return Types

public class CollectAmount {

	public Integer collectedAmount=1000;
	
	//Return type should be what ever data type given will be the function 
	//data type as below
	
	public Integer collectAmountAndGiveItToMe() {
		
		//void will not return anything
		System.out.println("Daddy collected rupee is" + collectedAmount+" and Sent it to you");
		return collectedAmount;
		
	}
	
	
	public static void main(String[] args) {
		
		CollectAmount mySon = new CollectAmount();
		Integer amount= mySon.collectAmountAndGiveItToMe();
		System.out.println("Got the amount son"+ amount);
		
		
	}

}
