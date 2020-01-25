package com.csi.thread;

public class WorkerThread implements Runnable{
	private String message;

	public WorkerThread(String message) {
		super();
		this.message = message;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"(Start) Message= "+message);
		processmessage();
		System.out.println(Thread.currentThread().getName()+"(End)");
	}
	private void processmessage()
	{
		try
		{
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
