package com.bptn.course.week4.tuesday;

/*
 * We create abstract classes to extend them.
 * We cannot create instances of an abstract class.
 */
abstract class AbstractClass {
	
	/*
	 * We can have two types of methods in abstract classes.
	 * 1. abstract methods. - Don't have a body.
	 * 2. non-abstract methods - Methods with a body;
	 */
	
	int myAttribute = 0;

	public AbstractClass() {}
	
	public AbstractClass(int myAttribute) {
		this.myAttribute = myAttribute;
	}

	abstract void display(); //abstract method - with no body
	
	void doSomething() { // non-abstract method - with body
		System.out.println("Doing Something");
	}
}

abstract class Hello{
	
	abstract void display();
}

/*
 * Classes that extend (inherit) Abstract classes 
 * MUST implement the inherited abstract methods. 
 */
class Child extends AbstractClass{
	
	public Child(int myAttribute) {
	}

	@Override
	void display() {
		System.out.println(this.myAttribute);
	}
	
	@Override
	void doSomething() { // non-abstract method - with body
		System.out.println("Doing Something - Child");
	}

}

class Child2 extends AbstractClass{

	public Child2(int myAttribute) {
	}

	@Override
	void display() {
		
	}
	
}


public class AbstractClassExample {

	public static void main(String[] args) {

		AbstractClass obj = new Child(10);
		
		obj.display();
		obj.doSomething();
		
	}

}
