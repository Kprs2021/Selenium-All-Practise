package Selenium;

//public class JavaVariables {
//
////  Local Variables:
//    
//  	 
//      public void Age() {
// 
//            int age = 0; // Local Variable
//            age = age + 7;
//            System.out.println("Dog's age is : " + age);
// 
//      }
// 
//      public static void main(String args[]) {
// 
//    	  JavaVariables dog = new JavaVariables();
//          dog.Age();
// 
//      
// 
//      }
//
//}

//	Instance variables:

public class Employee {
	 
    // this instance variable is visible for any child class.

    public String name;  // Instance Variable

    // salary variable is visible in Employee class only.

    private double salary;   // Instance Variable

    // The name variable is assigned in the constructor.

    public Employee(String empName) {

    name = empName;

    }

    // The salary variable is assigned a value.

    public void setSalary(double empSal) {

          salary = empSal;

    }

    // This method prints the employee details.

    public void printEmp() {

          System.out.println("name : " + name);

          System.out.println("salary :" + salary);

    }

    public static void main(String args[]) {

          Employee emp1 = new Employee("Sandeep");

          emp1.setSalary(1000);

          emp1.printEmp();
    }
}


//	Class / static variables:

public class Static_Java{

    // salary variable is a private static variable
	// Static Variable
    private static double salary;

    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development";

    public static void main(String args[]){

         salary = 1000;

         System.out.println(DEPARTMENT+"average salary:"+salary);

}
    

}
