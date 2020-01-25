package com.csi.thread;
class MyThreads extends Thread
{
	public void run()
	{
		
		System.out.println("Inspiria Mall");
	}
}
class MyThreads1 extends Thread
{
	public void run()
	{
		System.out.println("Pune");
	}
}
public class ThreadPriorityConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThreads mt=new MyThreads();
mt.setPriority(1);
mt.start();
MyThreads1 mt1=new MyThreads1();
mt1.setName("Jerry");
mt1.setPriority(Thread.NORM_PRIORITY);
System.out.println(mt1.getName());
System.out.println(Thread.currentThread());
MyThreads1 mt2=new MyThreads1();
mt2.start();
	}

}
