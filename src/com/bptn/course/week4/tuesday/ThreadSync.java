package com.bptn.course.week4.tuesday;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Id {

	static void insertNextId(List<Integer> list) {

		int max = 0;

		for (int id : list) {
			if (id > max) {
				max = id;
			}

		}

		list.add(++max);
		System.out.println("Inserted: " + Thread.currentThread().getName() + ", " + max);

	}

}

class MyThread2 extends Thread {

	List<Integer> list;
		
	public MyThread2(String name,List<Integer> list) {
		super(name);
		this.list = list;
	}

	@Override
	public void run() {				
		System.out.println("Running: " + this.getName());

		Id.insertNextId(list);
	
		System.out.println("Exiting: " + this.getName());
	}
}

public class ThreadSync {

	public static void main(String[] args) throws InterruptedException {
		
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(5,1,4,3,6,2)); 
		
		MyThread2 t1 =new MyThread2("T1",list);  
		MyThread2 t2 =new MyThread2("T2",list);  
		
		t1.start();  
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(list);
	}

}
