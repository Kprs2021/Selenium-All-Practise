package com.lao.javalearning;

public class BankAccount {
	
	Long accountnumber=1234567890l;
	//Long data type "l" pottu append panni vaikanum.
	String holderName="Agni";
	Integer accountBalance=350;
	
	//The above 3 are datas.
	
	//Method:we need method/function to use the above datas
	public void getBalance() {
		
		System.out.println("AccountHolders Name is" + holderName);
		System.out.println("Account Number is" + accountnumber);
		System.out.println("Balance is" + accountBalance);
		
	}
	

	public static void main(String[] args) {
		//ClassName objName=new ClassName();
		//object is below.
		BankAccount bankDetails = new BankAccount();
		bankDetails.getBalance();
		

	}

}
