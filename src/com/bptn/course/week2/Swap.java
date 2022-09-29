package com.bptn.course.week2;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {

		
		int x;
		int y;
		int temp;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input x: ");
		x = Integer.valueOf( scan.nextLine() );
		
		System.out.println("Please input y: ");
		y = Integer.valueOf( scan.nextLine() );
		
		System.out.println(" x value: " + x + ", y value: " + y);
		
		// Swapping using a temporary variable.
		temp = x;
		x = y;
		y = temp;
		
		System.out.println(" x value: " + x + ", y value: " + y);
		
	}

}
