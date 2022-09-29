package com.bptn.course.week1;

public class Challenge {

	
	public static void main(String[] args) {
		
		int count = numberOfSteps(14);
		
		System.out.println(count);
	}
	
    public static int numberOfSteps(int num) {
        
    	int counter = 0;
    	
    	while (num >0) {
    		
    		counter++;
    	
    	    if (num%2==0) {
    	    	num/=2;
    	    }else {
    	    	num-=1;
    	    }
    	}
    	
    	return counter;
    }
}
