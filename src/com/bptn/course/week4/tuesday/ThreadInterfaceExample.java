package com.bptn.course.week4.tuesday;

class MyThreadWithInterface implements Runnable {

	String name;
	
	
	public MyThreadWithInterface(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		System.out.println("Running: , " +this.name);
		
		try {
  		   for (int i=10; i>0; i--) {
			  System.out.println("Thread: , " + this.name + ", " + i);
			  //Thread.sleep(100);
  		   }
		} catch (Exception e) {
				e.printStackTrace();
		}

		System.out.println("Exiting: " + this.name);		
	}
	
}


public class ThreadInterfaceExample {

	public static void main(String[] args) {
		
		MyThreadWithInterface obj = new MyThreadWithInterface("T1");
		Thread t1 = new Thread(obj);
		
		t1.start();

		MyThreadWithInterface obj2 = new MyThreadWithInterface("T2");
		Thread t2 = new Thread(obj2);
		
		t2.start();
		
		MyThreadWithInterface obj3 = new MyThreadWithInterface("T3");
		Thread t3 = new Thread(obj3);
		
		t3.start();
	}

}
