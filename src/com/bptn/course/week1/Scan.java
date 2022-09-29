package com.bptn.course.week1;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); //Creates an Scanner object so we can read info from the keyboard.
//		
		System.out.println("Enter your Age ");
//		
		String age = scan.nextLine(); // Reads a String from the console.
		
		int age2 = Integer.parseInt(age);
//		
//		System.out.println("Age is " + age); // Display a Hello.
	
		//UNICODE
		
		int i = (int)'C';
		
		char c = 'A'; //65
		int a = c;
		
		
		String s = new String("Hello");
		
		
		//dispose(s)
		
		System.out.println(a);
	}

}
