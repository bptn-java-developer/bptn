package com.bptn.course.week4.wednesday;

public class Calculation {  
	  
    public static int findMax(int arr[]){  
 
    	int max=Integer.MIN_VALUE;  
    	
        for (int i=1; i<arr.length; i++){  
            if ( max < arr[i] ) {
            	max = arr[i];              	
            }
        }  
        return max;  
    }
    
    public static int longProcess(){  
    	 
    	int max=Integer.MIN_VALUE;  
    	
        for (int i=1; i<= 1000; i++){  
            if ( max < i ) {
            	max = i;              	
            }
        }  
        
//        try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
        
        return max;  
    }    
    
    public static boolean compare(int a, int b) {
    	return a==b;
    }
    
    public static Object getObject(Object obj) {
    	return obj;
    }
}
