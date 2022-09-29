package com.bptn.course.week1;

public class Conditionals {


	public static void main(String[] args) {

		int a = 4;
		int b = 2;

		// Nested Conditionals / Nested If Statements
		int c = 3;
		
		if ( a > b ) {
			
			if (a < c) {
				System.out.println(a + " is smaller than " + c);				
			} else {
				System.out.println(a + " is bigger than " + c);
			}
			
		} else {
			System.out.println(a + " is smaller than " + b);
			
		}
		
		
		
		
		
//		if (a > b) {
//
//			System.out.println(a + " is bigger than " + b);
//
//		} else if (a < b) {
//
//			System.out.println(a + " is smaller than " + b);
//
//		} else if (a < b) {
//
//			System.out.println(a + " is smaller than " + b);
//
//		} else {
//
//			System.out.println(a + " is equal to " + b);
//
//		}

	}
	
}
