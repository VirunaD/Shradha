package com.csi.thread;

class MyThread extends Thread {
	public void run() {
		int i;
		for (i = 1; i <= 5; i++) {
			try {
				Thread.sleep(100);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread t1=new MyThread();
//MyThread t2=new MyThread();
t1.start();
/*t1.run();
t2.run();
*/	}

}
