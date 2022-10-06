package com.bptn.course.week3.static_keyword;

import java.util.Arrays;

/*
 * The static keyword indicates that the member (attributes and methods) belongs
 * to the class and not to the object.
 * 
 * In other words we can use the member without creating the actual object.
 */

class Employee{
	
	/*
	 * In Java we create constants using the keywords static and final simultineously
	 * static: means the variable is shared across all the objects of the class.
	 * final: means the variable cannot be modified once initialized.
	 * 
	 * By Convention: ALL Java constants names must be in upper-case letters.
	 */
	static final double PI = 3.14159;
	
	static int age; // Static shares this attribute across all the objects of the class
	
	String name; // This is a non-static variable (in other words belongs to the object)
	
	int[] array = { 1, 2, 3, 4, 5};
	
	
	/*
	 * static method -----> No access to non-static variables and non-static methods.
	 * non-static methods ---> We have access to everything, including static methods and attributes.
	 * 
	 */
	
	
	static int add2Numbers(int a, int b) {
		
		/*
		 * Special Considerations when creating static methods:
		 * 
		 * We cannot refer non-static members(attributes and methods) from static methods.
		 * We can only refer static members from static methods.
		 * 
		 * Note.- A good indicator that a method can be static is when its execution
		 * depends solely on the parameters (or static members) 
		 */
		
		//this.name = "John";
		
		age = 4; // We refer the attribute age from this static method because age is an static attribute.
		
		return a + b;
	}
	
	/*
	 * We can call static methods or access static attributes from non-static methods.
	 * But we need to create an object to run the non-static (normal) method.
	 */
	int add3Numbers(int a, int b, int c) {
		
		int result = Employee.add2Numbers(a, b) + c;
		
		return result;
	}
	
	
	
	void processArray() {
		
		for(int i=0;i < array.length; i++) {
			
			array[i] = Employee.toPowerOf2(array[i]);
		}
	}
	
	static int toPowerOf2(int a) {
		
		return a*a;
		
		
	}
	
}



public class StaticKeyword {

	
	/* 
	 * We use "String[] args" to pass parameters to the Java program
	 * The Java Virtual Machine (JVM) is going to look for the main() method.
	 * 
	 * public static void main(String[] args)
	 */

	String hello = "Hello";
	
	public static void main(String[] args) {

		
		System.out.println(Arrays.toString(args));
		
		Employee emp1 = new Employee();
		emp1.age = 20;

		Employee emp2 = new Employee();
		emp2.age = 30;
		
		Employee emp3 = new Employee();
		emp3.age = 40;
		
		double calc1 = StaticKeyword.calculateInterest(4);
		
		//System.out.println("Emp1 age: " + emp1.age);
		
			
		int a = Employee.add2Numbers(5, 4); // We can call the static method from the class because it belongs
		//System.out.println(a);              // to the class as it is static.
		
		Employee emp4 = new Employee();
		int b = emp4.add2Numbers(7, 9); // We can also call the static method from an object of the class
		//System.out.println(b);          // but the drawback is that we need to create an object (unnecessarily)

		int c = new Employee().add2Numbers(7, 9); // We can also create an anonymuos object to call the method
		//System.out.println(c);          // without using a variable, but still the drawback is that we need 
		                                // to create an object (unnecessarily)
		
		double calc2 = StaticKeyword.calculateInterest(40);
		
		System.out.println(Math.random());
		System.out.println(Math.pow(2,4));
	
		/*
		 * If we need to call a method from the main() method we have two options:
		 * 1. I make the other method() static (simplest, but not always possible because we cannot call non-static 
		 *                                      attributes from the method)
		 * 2. Create an object of the class that contains the main() method, then call the non-static method using
		 *        the object.
		 */
		
		StaticKeyword obj = new StaticKeyword();
	    obj.printOut(4);
		
		//dispose(emp1);
	}
	
	void printOut(int a) {
		Employee obj = new Employee();
		
		String str = new String("Hello");
		
		System.out.println(obj.add3Numbers(3, 5, 6));
		System.out.println("The input is: " + a + " " + this.hello);
		
		
		System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
	}
	
	static double calculateInterest(int accountNumber) {
		
		double interest = 0;
		
		/*
		 * perform some business logic
		 */
		
		return interest;	
	}
	

}
