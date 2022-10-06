package com.bptn.course.week2;

public class SearchExample {

	public static void main(String[] args) {

		int key = 12;
		int[] a = { 2, 3, 5, 9, 12, 15 };

		int ind = searchB(key,a);

		
		System.out.println(ind);
		//return -1;

	}
	
	static int searchB(int key, int[] a) {

		int left = 0;   // left index
		int right = a.length - 1; // right index
		
		int middle = 0;
		int ind = -1;
		
		while (left <= right) { // perfom the loop while left <= right
			
			middle = (left + right) / 2; // Find the index of the element in the middle
			
			if ( key < a[middle] ){ // if the key is small the value in the middle
				right = middle -1 ;  // the new right is (middle -1)
			} else if ( key > a[middle] ) { // if the key is bigger than the value in the middle
				left = middle + 1;  // the new left is (middle +1)
			} else if ( key == a[middle] ){
				ind = middle;
				break;
				//return middle; // if the value is equal return the index of the middle
			}
		}
		//System.out.println(ind);
		
		return ind;
	}

}
