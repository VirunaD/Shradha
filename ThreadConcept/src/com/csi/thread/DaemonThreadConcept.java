package com.csi.thread;

public class DaemonThreadConcept extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon())    // checking for daemon thread
		{
			System.out.println("Daemon thread work");
		} else {
			System.out.println("User thread work");
		}
	}

	public static void main(String[] args) {
		DaemonThreadConcept dt = new DaemonThreadConcept();    // create thread
		DaemonThreadConcept dt1 = new DaemonThreadConcept();
		DaemonThreadConcept dt2 = new DaemonThreadConcept();
		dt1.start();
		dt2.start();
		dt.setDaemon(true);     // now dt is daemon thread
	}

}
