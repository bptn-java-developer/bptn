package com.bptn.course.week2;

public class LinearSearch {

	public static void main(String[] args) {

		
		// Search #1
		int key = 15;
        int ind = 0;	
        
		int[] a = { 3, 8, 4, 2, 12, 6 };
		//          0  1  2  3   4  5		
		ind = search(a,key);
		System.out.println("Index :" + ind);

		
		// Search #2
		key = 8;
		int[] b = { 5, 4, 1, 13, 8, 9 };
		//          0  1  2  3   4  5	
		
		ind = search(b,key);
		System.out.println("Index :" + ind);
	
		
		// Search #3
		String str = "purple";
		String[] c = {"blue", "red", "purple", "green"};
		
		ind = searchString(c,str);
		System.out.println("Index :" + ind);
	}
	
	// Two parameters        array  ,   key
	public static int search(int[] a, int key) {
	//                
		int ind = -1;
		
		for (int i =0; i < a.length; i++ ) {
			
			if ( key == a[i] ) {
				ind = i;
				break; // breaks out from the for loop
			}
		}
		
		return ind;
	}

	public static int searchString(String[] a, String key) {
		//                
		int ind = -1;
		
		for (int i =0; i < a.length; i++ ) {
			
			if ( key.equals(a[i]) ) {
				ind = i;
				break; // breaks out from the for loop
			}
		}
		
		return ind;
	}

}
