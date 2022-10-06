package com.bptn.course.week3.team4;

class Person {
	
	private String name = null;

	public Person(String theName) {
		name = theName;
	}

	public String getFood() {
		return "Hamburger";
	}
}

class Student extends Person {
	
	private int id;
	private static int nextId = 0;

	public Student(String theName) {
		super(theName);
		id = nextId;
		nextId++;
	}

	public String getFood() {
		String output = super.getFood();
		return output + " and Taco";
	}

	public int getId() {
		return this.id;
	}

	public void setId(int theId) {
		this.id = theId;
	}
	
	public static void main(String[] args) {
		
		
		  //Parent p = new Child();
			
			Student p = new Student("Javier");
			
			p.getFood();
			//p.s
			
			System.out.println(p.getFood());
		}
}

public class Inheritance {


}
