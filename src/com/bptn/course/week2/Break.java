package com.bptn.course.week2;

public class Break {

	public static void main(String[] args) {

		
		/*
		for(int i=0; i<10; i++) {
						
			
			if (i==5) {                
				break;
			}
			System.out.println(i);
		}
	    
	

		int i = 0;
		
		while (i<10) {

			if (i==5) {                
				break;
			}

			System.out.println(i);
			
			i++;
		}*/
        /*
		for(int i=0; i<5;i++) {
			hello: // label that marks where you want to break out 
			for(int j=0; j<4;j++) {
				
				if (j==2) {
					break outer;
				}
				System.out.println("i: " + i + ", j: " + j);				
			}
		}*/
		
		/*
		for (int i = 0; i < 10; i++) {

			if (i > 5) {
				continue; // Skip the current iteration and jumps to the next iteration
			}

			System.out.println(i);
		}*/
		
		int i = 0;
		while (i<10) {
			
			
			if (i == 5) {				
				continue; // Skip the current iteration and jumps to the next iteration
			}
			
			i++;
			System.out.println(i);

		}
		
		System.out.println("After the loop");
		
	}

}
