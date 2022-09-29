package com.bptn.course.week2;

public class Switch {

	public static void main(String[] args) {

		
		/*
		 *  Day 0 ---> Sunday
		 *  Day 1 ---> Monday
		 *  Day 2 ---> Tuesday
		 *  Day 3 ---> Wednesday
		 *  Day 4 ---> Thursday
		 *  Day 5 ---> Friday
		 *  Day 6 ---> Saturday
		 */

		int day = 4;
		String str = "";

		
		if ( day>0 ) {
		   str = "Sunday";	
		} else if ( day==1 ) {
			str = "Monday";
		} else if ( day==2 ) {
			str = "Tuesday";
		} else if ( day==3 ) {
			str = "Wednesday";
		} else if ( day==4 ) {
			str = "Thursday";
		} else if ( day==5 ) {
			str = "Friday";
		} else if ( day==6 ) {
			str = "Saturday";
		} else {
			str = "Invalid Day";
		}
		
		System.out.println(str);
		
		//Using a switch statements

		String str3 = null;
		
		day = 1;

		
		//25 < a < 100
		
		switch(str) {
		case "admin":
			day = 0;
			str = "hello";
			String str2 = "hello2";
//			break;
		case "Monday":
			day = 1;
			break;
		case "2":
			System.out.println("Tuesday");
			break;
		case "3":
			System.out.println("Wednesday");
			break;
		case "4":
			System.out.println("Thursday");
			str = "Thursday";
			break;
		case "5":
			str = "Friday";
		case "":
			str = "Saturday";
			System.out.println("Weekend");
			break;
		default:
			str = "Invalid Day";
			System.out.println("Invalid Day");
		}		
		
		int a =45;
		//str2 = "hello3";
	}
}
