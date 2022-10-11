package com.bptn.course.week4.tuesday;


/*
 * A Java Interface is like a contract that must be accomplished 
 * by the class or classes that implement the interface.
 * 
 * The purpose of an Interface is to have abstract methods.
 * All my interface's methods are "public abstract" by default.  
 */
interface MyInterface {
	
	void doSomething();
	
	int add(int a, int b);
	
	void display();
	
	default void newDisplay() {
		System.out.println("new Display method");
	};
	
	static void newDisplay2() {
		System.out.println("new Display method 2");
	};
	
}

interface MyInterfaceA extends MyInterface {
	
	void doSomething2();
	
	int add2(int a, int b);
	
	void display2();
}


class Parent1{
	
}

class Parent2{
	
}

/*
class Child extends Parent1, Parent2{
	
}*/

class MyClass implements MyInterface, MyInterfaceA {

	String myAtrribute;
	
	@Override
	public void doSomething() {
		System.out.println("Doing Something");
	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public void display() {
	    System.out.println(this.myAtrribute);	
	}

	@Override
	public void doSomething2() {
		System.out.println("Doing Something");
	}
	
	@Override
	public int add2(int a, int b) {
		return a + b;
	}
	
	@Override
	public void display2() {
		System.out.println(this.myAtrribute);	
	}

	@Override
	public void newDisplay() {
		System.out.println("new Display method for MyClass");
	};

	static void newDisplay2() {
		System.out.println("new Display method 3");
	}
}


public class InterfaceExample {

	public static void main(String[] args) {

		MyClass.newDisplay2();
	}

}
