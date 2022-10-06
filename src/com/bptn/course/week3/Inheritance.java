package com.bptn.course.week3;

import java.util.Arrays;

class Person {
	
	// Constant
	static final int A = 4;
	
	// 1. Attributes
	private int id;
	private String firstName;
	private String lastName;
	private double salary;
	
	// If no constructor is specified, Java will create a default constructor(doesn't take parameters) for you. 
	// See below.
    // Person(){}
	// If you define a constructor, Java won't create the default constructor.

	// Polymorfism - Overloading
	
	// 2. Constructors
	
	Person(){}
	
	Person(int id) {
		super();
		this.id = id;
	}

	Person(String lastName) {
		super();
		this.lastName = lastName;
	}

	Person(int id, String firstName, String lastName, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// 3. Methods
	void display() { // Method declaration
		// Method's body or Method's definition
		System.out.println("id: " + id);
		System.out.println("firstName: " + firstName);
		System.out.println("lastName: " + lastName);
		System.out.println("salary: " + salary);
		//System.out.println("");
	}
	
	void display(String str) {
		//this.display();
		
		str= "BPTN";
		System.out.println("String: " + str);
	}
}

//class MyString extends String{
//	
//}

class Employee extends Person {

	/* Employee's Attributes*/
	String position;
		
	Employee(int id, String firstName, String lastName, double salary, String position) {
		super(id, firstName, lastName, salary);
		
		this.position = position;
	}
	
	// Java Annotation
	// Informational Annotation
	// 1. Provides Information that this method is overriden to the software developer
	// 2. Java verifies that a method with the same signature exists in the parent class
	// Polymorfism - Override
	//    1. Overloading - Happens when in the same class we have two or more constructors or methods with the same name but 
	//                     different parameters
	//    2. Overriding - Happens when in the child class we have a method with the same signature is in the parent class. (Inheritance)
	@Override
	void display() {
		super.display("Hello");	
		System.out.println("id: " + this.getId());
		System.out.println("firstName: " + this.getFirstName());
		System.out.println("lastName: " + this.getLastName());
		System.out.println("salary: " + this.getSalary());
		System.out.println("position: " + position);		
		System.out.println("");		
	}
	
}

class Manager extends Person{

	Employee[] employees; // We create an array of employees because a Manager  
	                      // could have multiple employees assigned.
	
	Manager(int id, String firstName, String lastName, double salary,Employee[] employees) {
		super(id, firstName, lastName, salary);

		this.employees = employees;
	}
	
	@Override
	void display() {
		super.display();		
		System.out.println("employees: " + Arrays.toString(this.employees) );
	}
	
}

class Example {
	
}

public class Inheritance {

	public static void main(String[] args) {

		
		Example example = new Example();
		
		System.out.println(example.getClass().getName());
		
		System.exit(0);
		
		//a = 5;
		
		Employee emp1 = new Employee(1000,"John","Smith",100000,"Director") ;
		
		emp1.display();
		
		Employee[] employees = new Employee[2000];
		
		employees[0] = emp1;
		
		Manager man1 = new Manager(1010,"Nick","Johnson",120000,employees);
		man1.display();
		
		
		emp1.setId(1010);
		
		Person p = new Person();

	}

}
