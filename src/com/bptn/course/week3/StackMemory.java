package com.bptn.course.week3;

/*
 * Stack Memory
 */


class Class1{
	
	void method1() {
	  this.method2();	
	}
	
	void method2() {
		this.method3();
	}
	
	void method3() {
		this.method4();
	}
	
	void method4() {
		System.out.println("Hello");
		
		Object[] stack= Thread.currentThread().getStackTrace();
		
		for(Object obj: stack) {
			System.out.println(obj);
		}
	}

}


public class StackMemory {

	public static void main(String[] args) {

		Class1 obj = new Class1();
		
		obj.method1();
	}

}
