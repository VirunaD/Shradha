package com.csi.thread;

public class DaemonThread1 extends Thread {
	public void run() {
		System.out.println("Name: " + Thread.currentThread().getName());
		System.out.println("Daemon: " + Thread.currentThread().isDaemon());
	}

	public static void main(String[] args) {
		DaemonThread1 dt = new DaemonThread1();
		DaemonThread1 dt1 = new DaemonThread1();
	//	dt.start();//If you want to make a user thread as Daemon, it must not be started otherwise it will throw IllegalThreadStateException
		dt.setDaemon(true);
		dt1.start();
	}

}
