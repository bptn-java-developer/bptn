package com.bptn.course.week4.thursday;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		
	    List<String> cars = new ArrayList<>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    // We can loop over Java collections using an Iterator.
	    // But the Foreach loop is preferred.
	    
	    for (String car: cars) { // Java 5
	    	System.out.println(car);
	    	
	    	cars.remove(car);
	    }
	    
	    Iterator<String> iterator = cars.iterator(); // Before java 5
	    
	    while ( iterator.hasNext() ) { // Ask if there is a next element in the collect (Testing)
	    	
	    	System.out.println(iterator.next()); // we get the value with the next() method
	        iterator.remove();
	    }
	    
	}
}
