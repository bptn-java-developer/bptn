package com.bptn.course.week2;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int key = 21;
		int[] a = { 2, 3, 5, 9, 12, 15 };
		//          0  1  2  3   4   5
		
		int ind = search(a,key); // log(n)		
		System.out.println("Index: " + ind);
		
		for() { //O(n)
			
		}
		// Search Strings
		
		
		String str = "pineapple"; 
		String[] b = {"apple","banana","cherry","kiwi","melon"};
		
		ind = searchString(b, str);		
		System.out.println("Index: " + ind);
		
	}
	
	

	public static int search(int a[], int key) {
		
		
		int left = 0;   // left index
		int right = a.length - 1; // right index
		
		int middle = 0;
		
		while (left <= right) { // perfom the loop while left <= right
			
			middle = (left + right) / 2; // Find the index of the element in the middle
			
			if ( key < a[middle] ){ // if the key is small the value in the middle
				right = middle -1 ;  // the new right is (middle -1)
			} else if ( key > a[middle] ) { // if the key is bigger than the value in the middle
				left = middle + 1;  // the new left is (middle +1)
			} else if ( key == a[middle] ){
				return middle; // if the value is equal return the index of the middle
			}
		}
		
		return -1;
	}

	public static int searchString(String[] a, String key) {
		
		
		int left = 0;   // left index
		int right = a.length - 1; // right index
		
		int middle = 0;
		
		while (left <= right) { // perfom the loop while left <= right
			
			middle = (left + right) / 2; // Find the index of the element in the middle
			
			if ( key.compareTo(a[middle]) < 0 ){ // if the key is small the value in the middle
				right = middle -1 ;  // the new right is (middle -1)
			} else if ( key.compareTo(a[middle]) > 0 ) { // if the key is bigger than the value in the middle
				left = middle + 1;  // the new left is (middle +1)
			} else if ( key.compareTo(a[middle]) == 0 ){
				return middle; // if the value is equal return the index of the middle
			}
		}
		
		return -1;
	}
}
