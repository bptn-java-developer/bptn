package com.bptn.course.week3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

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
	
	
	/*
	 * If we don't want to handle the exception in the method,
	 * we can throw it up to the caller using the throws keyword.
	 */
	void processFile() throws FileNotFoundException, IOException  {
		
		BufferedReader file = null;
		String line = null;
		
			
		file = File.open("testfile.txt",true); // Open the file
			
		while ((line = File.read(file))!=null) { // Read the file until there are no more lines to read.
			System.out.println(line);
		}
			
		File.close(file);
	}

	void processFile2() {
		
		BufferedReader file = null;
		String line = null;
		
		int a = 0;
		try {
			
			try {
				file = File.open("testfile.txt"); // Open the file				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			while ((line = File.read(file))!=null) { // Read the file until there are no more lines to read.
				System.out.println(line);
			}
			
			//a = 5/0;
			
		/*	
		} catch (ArithmeticException e) { // Unchecked
			a = -1;
			e.printStackTrace();*/	
		/*
		 * We can indicate that we need two different exceptions to share the same catch block
		 * 
		 * || -> OR Operator 
		 * | -> Tw
		 */
		} catch (final ArithmeticException | 
				       FileNotFoundException | 
				       IndexOutOfBoundsException ex) { //Checked
			
			ex.printStackTrace();
		} catch (IOException e) { //Checked
			e.printStackTrace();
		} catch (Exception e) { //Checked
			e.printStackTrace();
		} finally {
			//File.close(file);	
			
			try {
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	} 
			

void processFile3() {
	
	BufferedReader file = null;
	String line = null;
	
	int a = 0;
	try {		
		file = File.open("testfile.txt",true); // Open the file		
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();	
	}
	
	try {
		
		while ((line = File.read(file))!=null) { // Read the file until there are no more lines to read.
			System.out.println(line);
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}

} 
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionExample obj = new ExceptionExample();
		
		//obj.divide();


		obj.processFile2();


	}

}
