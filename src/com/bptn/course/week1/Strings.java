package com.bptn.course.week1;

public class Strings {

	
	
	public static void main(String[] args) {

		/*
		 * Primitives
		 * 
		 *   int
		 *   long
		 *   byte
		 *   short
		 *   double
		 *   float
		 *   boolean
		 * 
		 * 
		 * Class Variables
		 * 
		 *   String = null
		 */
		
	
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		String s3 = null;
		
		if ( s1 == s2 )  {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Diferent");
		}
		
		String s4 = "Hello";
		String s5 = " BPTN";
		
		System.out.println( s4 + s5 );
		System.out.println( s4.concat(s5) );
		
	}

}
