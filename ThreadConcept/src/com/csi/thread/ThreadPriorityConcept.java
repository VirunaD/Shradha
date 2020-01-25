package com.csi.thread;

public class ThreadPriorityConcept extends Thread{
public void run()
{
	System.out.println("running Thread name is: "+Thread.currentThread().getName());
	System.out.println("running thread priority is: "+Thread.currentThread().getPriority());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadPriorityConcept tp=new ThreadPriorityConcept();
ThreadPriorityConcept tp1=new ThreadPriorityConcept();
tp.setPriority(Thread.MAX_PRIORITY);
tp1.setPriority(Thread.MIN_PRIORITY);
tp.start();
tp1.start();
	}

}
