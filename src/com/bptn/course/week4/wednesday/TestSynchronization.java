package com.bptn.course.week4.wednesday;

class Table {
	
	static void printTable(int n) {// method not synchronized
		
		//synchronized() {			
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		//}
	}
}

class MyThread1 extends Thread {
	
	@Override
	public void run() {
		Table.printTable(5);
		super.run();
	}

}

class MyThread2 extends Thread {

	public void run() {
		Table.printTable(100);
	}
}

class TestSynchronization {
	
	
	public static void main(String args[]) {
		
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();

		t1.start();
		t2.start();
	}
} 