package com.technoelevate.multithread;

public class MyMain {

	public static void main(String[] args) {
		System.out.println("this is main thread");
		MyThread mythread = new MyThread();
		mythread.start();

		MyRunnable myrunnable = new MyRunnable();
		Thread myrunnablethread = new Thread(myrunnable);
		myrunnablethread.start();

		new Thread() {

			public void run() {
				System.out.println("helo this new thread");
			}
		}.start();
	}

}
