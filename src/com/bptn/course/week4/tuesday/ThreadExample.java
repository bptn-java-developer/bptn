package com.bptn.course.week4.tuesday;

import java.util.Arrays;

class MyThread extends Thread {
	
	String name;

	public MyThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		
		System.out.println("Running: " + this.getState()+ ", " +this.name);
		
		try {
  		   for (int i=10; i>0; i--) {
			  System.out.println("Thread: " + this.getState()+ ", " + this.name + ", " + i);
//			  Thread.sleep(100);
  		   }
		} catch (Exception e) {
				e.printStackTrace();
		}

		System.out.println("Exiting: " + this.name);
		this.doSomething();
	}
	
	private void doSomething() {		
		System.out.println("Stack: " + Arrays.toString(this.getStackTrace()));
	}
		
}
	
	
	
public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread("T-1");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setDaemon(true);
		System.out.println("T1 state: " + t1.getState() + " Priority: " + t1.getPriority() + ", isDeamon: " + t1.isDaemon());
		t1.start(); // Runnable -> 3.Running -> 2.Terminated

		MyThread t2 = new MyThread("T-2");
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("T2 state: " + t2.getState() + " Priority: " + t2.getPriority() + ", isDeamon: " + t2.isDaemon());
		t2.start(); // Runnable -> 1.Running -> 1.Terminated

		MyThread t3 = new MyThread("T-3");
		t3.setPriority(Thread.MAX_PRIORITY);
		System.out.println("T3 state: " + t3.getState() + " Priority: " + t3.getPriority() + ", isDeamon: " + t3.isDaemon());
		t3.start(); // Runnable -> 2.Running -> 3.Terminated

		
		Thread.sleep(2000);
		System.out.println("T1 state: " + t1.getState());
		System.out.println("T2 state: " + t2.getState());
		System.out.println("T3 state: " + t3.getState());
		
	}

}
