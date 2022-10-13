package com.bptn.course.week4.thursday;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		//
		// Internally a Stack is Vector(Synchronized List - Just 
		// one thread can access the Vector at a time)  
		//
		Stack<Integer> stck = new Stack();
		
		stck.push(78);
		stck.push(113);
		stck.push(90);
		stck.push(120);
		
		// 78 113  90 120
		//  0   1   2   3
		
		/*
		 * 120  - 3  1
		 * 90   - 2  2
		 * 113  - 1  3
		 * 78   - 0  4
		 */
		System.out.println("Stack size: " + stck.size());
		
		// We can also use the get() method with Stacks
		// because they are actually Vectors. The index
		// starts from 0.
		System.out.println("Get 0 " +  stck.get(0) );

		// The search() methods returns the distance from the
		// top of the stack to the first occurence of the element 
		// we search. So it starts from 1.
		System.out.println("Search 113 " +  stck.search(113) );
		
		// Removes the element at the top of the stack
		
		
		while( !stck.empty() ) {
			
			System.out.println(stck.pop());
		}

		System.out.println("Stack size: " + stck.size());

		System.exit(0);
		
		System.out.println("Stack size: " + stck.size());
		
		System.out.println(stck.pop());
		
		System.out.println("Stack size: " + stck.size());

		System.out.println(stck.pop());
		
		System.out.println("Stack size: " + stck.size());
		
		System.out.println(stck.peek() + "  Peek()");
		
		System.out.println("Stack size: " + stck.size());

		if (!stck.empty()) {			
			System.out.println(stck.pop());
		}
		
	}

}
