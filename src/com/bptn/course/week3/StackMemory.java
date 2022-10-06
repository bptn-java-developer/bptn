package com.bptn.course.week3;

/*
 * Stack Memory
 */


class Class1{
	
	void method1() {
	  this.method2();	
	}
	
	void method2() {
		
		try {
			this.method3();
		} catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
		}
	}
	
	void method3() {
		this.method4();
	}
	
	void method4() {
		System.out.println("Hello");
		
		int a = 5/0;
	}

}


public class StackMemory {

	public static void main(String[] args) {

		Class1 obj = new Class1();
		
		//try {
			obj.method1();
		//} catch (Exception e) {
        //    System.out.println(e.getMessage());
		//} 
	}

}
