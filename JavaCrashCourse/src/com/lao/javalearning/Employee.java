package com.lao.javalearning;

public class Employee {
	
	int employeeId;
	String employeeName;
	
	//Define a constructor
	//Constructor name and class name should be same as like below,
	Employee(){
		
		employeeId = 1;
		employeeName = "Karthi";
		System.out.println("Employee Object is Created");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		System.out.println(employee.employeeId);
		System.out.println(employee.employeeName);

	}

}
