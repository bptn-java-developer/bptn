package com.bptn.course.week2;

import java.util.Scanner;

class Month {
		
	// Converts the month number into the month name.
	String printMonth(int month) {

		String str = "";
		
		switch(month) {
		case 0: 
			str = "January";
		    break;
		case 1: 
			str = "February";
		    break;
		case 2: 
			str = "March";
		    break;
		case 3: 
			str = "April";
		    break;
		case 4: 
			str = "May";
		    break;
		case 5: 
			str = "June";
		    break;
		case 6: 
			str = "July";
		    break;
		case 7: 
			str = "August";
		    break;
		case 8: 
			str = "September";
		    break;
		case 9: 
			str = "October";
		    break;
		case 10: 
			str = "November";
		    break;	        
		case 11: 
			str = "December";
		    break;
		default: // If the month number doesn't exist
			str = "Invalid Month";
		}
		
		return str;
	}
}

public class MonthDetection {

	public static void main(String[] args) {

		//Create an object of class Month
		Month obj = new Month();
		
		//Create a scanner
		Scanner scan = new Scanner(System.in);
		
		//Grab user input
		System.out.println("Enter the month number: ");
		int month = scan.nextInt();
		
		//Converts the month number (user input) into the month name 
		//We call the printMonth() method of the Month object
		String str = obj.printMonth(month); 
		
		//Print out the month name.
		System.out.println("The month is: " + str);
		
		scan.close();

	}

}
