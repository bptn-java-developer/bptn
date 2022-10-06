package com.bptn.course.week3.thursday;


//Unchecked because extends RuntimeException class
class MyException extends RuntimeException{

	private static final long serialVersionUID = 6120763547455183810L;

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}
		
}

//Checked Exception because it extends Exception class
class MyException2 extends Exception {

	private static final long serialVersionUID = -2450510337151448488L;

	public MyException2() {
		super();
	}

	public MyException2(String message) {
		super(message);
	}

}




public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionExample obj = new ExceptionExample();

		
		// It's not mandatory the try-catch block because processSomething() 
		// throws an Unchecked Exception
		obj.processSomething();

		
		try {
			// processSomething2() needs a try-catch block because it throws 
			// a Checked Exception
			obj.processSomething2();
			
		} catch (MyException2 e) {
            System.out.println("Dear User, please try later!");
		}
		
	}
	
	
	void processSomething() { // We don't need the throws keyword because MyException is Unchecked
		
		double value = 0; //Cannot be Zero, if it's Zero it's because sth very bad is happening
		
		/*
		 * We have a very interesting business logic
		 */
		
		value = -100;
		
		if (value < 0) {
			//throw new ArithmeticException("hahahah");
			throw new MyException("The calculated value was Negative: " + value);
		}		
		
	}

	void processSomething2() throws MyException2 { // We do need the throws because MyException is Checked
		
		double value = 0; //Cannot be Zero, if it's Zero it's because sth very bad is happening
		
		/*
		 * We have a very interesting business logic
		 */
		
		value = -100;
		
		if (value < 0) {
			//throw new ArithmeticException("hahahah");
			throw new MyException("The calculated value was Negative: " + value);
		}		
		
	}

}
