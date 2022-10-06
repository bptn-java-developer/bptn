package com.bptn.course.week3.thursday;

public class NestedException {

	
	
	public static void main(String[] args) {

		try {
			
			int b = 100;
			
			
			
			try {
				
				b = b / 0;
				
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			
			int[] a = new int[10];
			try {
				
				a[50] = 100; 
				
			} catch (ArrayIndexOutOfBoundsException e) {

				System.out.println(e.getMessage());
			}
			
			String str = null;
			
			try {
				
				int c = str.length();
				
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			}
			
			
			String str2 = "123";
			
			try {
				
				int i = Integer.parseInt(str2);
				
			} catch (NumberFormatException e) {
                System.out.println(e.getMessage());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
