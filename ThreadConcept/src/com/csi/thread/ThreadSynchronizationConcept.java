package com.csi.thread;

class Table {
	synchronized public void printTable(int n) {
		int i;
		for (i = 1; i <= 5; i++) {
			try {
				Thread.sleep(100);
				System.out.println(i * n);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread {
	Table t;

	public MyThread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(10);
	}
}

class MyThread2 extends Thread {
	Table t;

	public MyThread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

class MyThread3 extends Thread {
	Table t;

	public MyThread3(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(2000);
	}
}

class MyThread4 extends Thread {
	Table t;

	public MyThread4(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(2);
	}
}

public class ThreadSynchronizationConcept {

	public static void main(String[] args) {
		Table tt = new Table();
		MyThread1 t1 = new MyThread1(tt);
		MyThread2 t2 = new MyThread2(tt);
		MyThread3 t3 = new MyThread3(tt);
		MyThread4 t4 = new MyThread4(tt);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
