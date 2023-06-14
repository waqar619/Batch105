package com.multithreading;

public class ThreadUsingExtend extends Thread {

	@Override
	public void run() {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Table of 3 is: "+ i*3);
			
		}
		//System.out.println("Thread with id "+ Thread.currentThread().getId());
	}
	

}
