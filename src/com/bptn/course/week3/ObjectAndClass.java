package com.bptn.course.week3;

class Student{
	
	String name;
	
	Student(String name){
		this.name = name;
	}
}

class EmployeeA {	
	/*
	 * Attributes
	 * 
	 * 1. Fields
	 * 2. Properties
	 * 3. Instance Variables
	 */
    int id;
	String name;
	double salary;
	String position;
	/*
	 * Constructor
	 * 
	 * Is a special method (block of code) that is used to initialize objects.
	 * The constructors is called automatically when an object of the class is created
	 * 
	 * Constructors Rules:
	 * 
	 * 1. The constructor name must be the same as the class name.
	 * 2. Must not return a value; 
	 * 
	 * Polymorfism - Overloading
	 */
	
	EmployeeA(){ //Default Constructor.
		this.id = 0;
		this.name = "";
		salary = 0.0;
		position = "";
		
		System.out.println("Inside the constructor");   
	}

	// Parameterized Constructor.
	EmployeeA(int id, String name, double salary, String position){
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.position = position;
		
		System.out.println("Inside the constructor 2");   
	}
	/*
	 * Methods
	 * 
	 * Is block of code that runs when it is called.
	 * 
	 * Behaviour
	 * Polymorfism - Overloading
	 */
	double bonus(double percentage) { //signature
		
		double tmp = (salary * percentage)/100;
		
		return tmp;
	}

	double bonus(double percentage, int param2) {
		
		double tmp = (this.salary * percentage)/100;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		
		return tmp;
	}
	
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(position);
		System.out.println("");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", position=" + position + "]";
	}		
}


public class ObjectAndClass {

	public static void main(String[] args) {

		
		/*
		 * If we access the attributes from another class then we don't follow the encapsulation
		 * OOP Concept.
		 */
		EmployeeA obj1 = new EmployeeA(); // The constructor is called when the object is created.
		
		obj1.id = 1010;
		obj1.name = "John";
		obj1.salary = 80000;
		obj1.position = "Manager";
		
		obj1.display();

		
		EmployeeA obj2 = new EmployeeA(); // The constructor is called when the object is created.
		
		obj2.id = 1020;
		obj2.name = "David";
		obj2.salary = 50000;
		obj2.position = "Assistant";
		
		obj2.display();

		/*
		 * If we don't have the values of the attributes of the object, we can just create the object and
		 * initialize the attributes later with setters. 
		 */
		EmployeeA obj3 = new EmployeeA(); // The constructor is called when the object is created.
		
		obj3.setId(1030);
		obj3.setName("Robert");
		obj3.setSalary(90000);
		obj3.setPosition("Accountant");
		
		obj3.display();

		/*
		 * If we have the values of the attributes of the object, we can create the object with a
		 * parameterized constructor.
		 */
		EmployeeA obj4 = new EmployeeA(1040,"Joe",100000,"Director"); // The constructor is called when the object is created.	
	    obj4.display();

	    double bonus = obj4.bonus(10);
	    System.out.println("The bonus for emp 4 is: " + bonus);
	    
	    Student stu = new Student("Hello");
	    
	    System.out.println(obj4);
	    
	    
	    EmployeeA[] employees = new EmployeeA[4];
	    
	    employees[0] = obj1;
	    employees[1] = obj2;
	    employees[2] = obj3;
	    employees[3] = obj4;
	}

}
