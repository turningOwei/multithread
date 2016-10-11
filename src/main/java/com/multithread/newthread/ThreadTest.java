package com.multithread.newthread;

public class ThreadTest extends Thread {
	public void run() {
		System.out.println("MyThread.run()");
	}

	public static void main(String[] args) {
		ThreadExtend te = new ThreadExtend();
		ThreadTest tt = new ThreadTest();
		new Thread(te).start();
		tt.start();
	}
}
