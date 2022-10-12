package com.bptn.course.week4.wednesday;

import java.util.ArrayList;
import java.util.List;


class Person{
	
	String name;
	int age;
	
}

public class ArrayListExample {

	
	
	public static void main(String[] args) {

		//Create a list of Strings
		List<String> list = new ArrayList<>();
		
		list.add("John");
		list.add("Jane");
		list.add("Mike");
		list.add("Pete");
		
		// ["John","Jane","Mike","Pete"]
		//    0       1      2      3
		
		System.out.println("Size: " + list.size());
		
		System.out.println("The element at index=2: " + list.get(2));

		System.out.println("The index of Jane is : " + list.indexOf("Jane"));
		
		// Prints out all the elements of the list with for loop
//		for (int i=0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		// Prints out all the elements of the list with for-each
//		for (String str : list) {
//			System.out.println(str);
//		}
		
		// Prints out all the elements of the list with foreach
		
		//inserts an element in the list
		list.add(2,"Nick");

		//replaces an element in the list
		list.set(2,"Lily");

		//remove an element in the list
		list.remove(2);
		
		//list.clear();
		
		// OOP - Functional Programming - Method Reference
		// We are passing the code of the println method to
		// the foreach method.
		
		//list.forEach( n -> System.out.println(n + " Hello") ); // Lambda Expression
		
		//list.forEach( System.out::println ); // Method Reference
		
		int i =0;
		
		while( i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		System.out.println("Size: " + list.size());		
	}

}
