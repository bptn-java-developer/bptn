package com.bptn.course.week1;

public class Loops {

	
	
	public static void main(String[] args) {

		// i++ == i=i+1
		
		//  initilization ; condition for executing the; increment the variable
		
		int[] arr = { 3, 4, 5, 6, 7}; 
		//            0  1  2  3  4
		/*
		 * traditional for-loop
		 */
		
		for(int i=0; i < arr.length; i++) {
			
			if (i!=2) {
				System.out.println( arr[i] );
			}
		}
		
		/* for-each */
		/*
		for(int num : arr) {
			if ( num!=5 ) {
				System.out.println(num);
			}
		}*/
		
		
	}

	
}
