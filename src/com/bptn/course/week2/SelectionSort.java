package com.bptn.course.week2;

import java.util.Arrays;

public class SelectionSort {

	
	public static void main(String[] args) {

		
		//Create an object of class Month
		Month obj = new Month();
		
		obj.printMonth(0);
		
		int[] a = { 8, 4, 5, 9, 11, 2, 7 };		
        int[] b = sort(a);//Jump to line 21
		
        int[] c = { 5, 3, 5, 9, 11, 2, 7 };		
        int[] d = sort(c);
        
		System.out.println(Arrays.toString(b)); // Arrays is a built-in Java Library that comes with several utility
		                                        // methods we can use with Arrays.
		
	}

	static int[] sort(int[] a) {
		
		// First FOR LOOP
		for (int j=0; j<a.length-1; j++) {
			
			int minIndex = j; // Store the index of the minimum value (temporarily) 
			
			// Second FOR LOOP
			for(int k=j+1; k<a.length; k++) {
							
				if ( a[k] < a[minIndex] ) { //If the value at index K is smaller than the value at minIdex
					minIndex = k;
				}
			}
		    	
			// It's time to swap values
			
			int temp = a[j]; // store the value at index j in a temp variable. 
			
			a[j]= a[minIndex]; // replace the value at index j with the minimum number found
			
			a[minIndex] = temp; // replace the value at minIndex with the value in temp variable
						
		}
				
		return a;// Jump back to the caller
		
	}
	
	

}
