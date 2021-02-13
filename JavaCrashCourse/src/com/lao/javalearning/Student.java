package com.lao.javalearning;

public class Student {
	
	String Student_name;
	int rollNo;
	Integer rollno;
	
	//int default constructor is "0"
	//Integer(wrapper class) and String default constructor is "null"
	//Integer(wrapper class) is also class, so its default value  is "null"
	//Example for default Constructor
	//Do you see any constructors here? Nope! Then you have no special 
	//powers. compiler has create one here!!
	

	public static void main(String[] args) {
		
		
		Student student = new Student();
		System.out.println(student.Student_name);
		System.out.println(student.rollNo);
		System.out.println(student.rollno);
		

	}

}
