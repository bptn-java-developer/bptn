package com.bptn.course.week4.wednesday;

class MyThreadHook extends Thread {
	
	public void run() {
		
		// We release any resources used.
		System.out.println("shut down hook task completed..");
	}
}

public class Shutdown {
	
	public static void main(String[] args) throws Exception {

		Runtime r = Runtime.getRuntime();
		
		// We add the thread that will be executed before the JVM dies.
		r.addShutdownHook(new MyThreadHook());

		System.out.println("Now main sleeping... press ctrl+c to exit");
		
		try {
			Thread.sleep(10000);
		} catch (Exception e) {}

	}
}
