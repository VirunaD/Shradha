package com.csi.thread;

class Thread1 extends Thread {
	public void run() {
		int i;
		for (i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}
}
class Thread2 extends Thread {
	public void run() {
		int i;
		for (i = 11; i <= 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}
}
public class JoinMethod {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
	//	Thread tt=new Thread(t1);	
		Thread2 t2=new Thread2();
		Thread1 t3=new Thread1();
		t1.start();
		try {
			//t1.join();
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
	}

}
