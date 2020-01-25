package com.csi.thread;

public class CurrentThreadConcept extends Thread{
public void run()
{
	System.out.println(Thread.currentThread().getName());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CurrentThreadConcept cc=new CurrentThreadConcept();
CurrentThreadConcept cc1=new CurrentThreadConcept();
cc.start();
cc1.start();
System.out.println("Hye");
	}

}
