package com.bptn.course.week3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {

	
	void divide() {
		
		int a = 5;
		int b = 0; // The program reads the value from a DB;
		
		int c = 0;
		
		// ArithmeticException - Unchecked Exception
		c = a / b;
		
		
	
		try { // We put the risky code in the try block.
			
			c = a / b;
			
		} 
		catch (ArithmeticException e) { //We put in the catch block what we will do if the exception happen.
			
			System.out.println("Dear valued User, the system is unavailable at this moment. Please try in 5 minutes. " 
			                   + e.getMessage());
			
			//e.printStackTrace();
			
			
            c = 0;
		}
		
		
		
		System.out.println(c);
	}
	
	void index() {
		
		int[] a = { 1, 2, 3, 4 };
		//          0  1  2  3
		
		try {
			
			a[4] = 4;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dear valued User, the system is unavailable at this moment. Please try in 5 minutes. " 
	                   + e.getMessage());			// TODO: handle exception
		}
		
	}
	
	
	void processFile() throws IOException {
		
		BufferedReader file = null;
		String line = null;
		
			
			file = File.open("testfile.txt",true); // Open the file
			
			while ((line = File.read(file))!=null) { // Read the file until there are no more lines to read.
				System.out.println(line);
			}
			
			File.close(file);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionExample obj = new ExceptionExample();
		
		//obj.divide();
		try {
			obj.processFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
