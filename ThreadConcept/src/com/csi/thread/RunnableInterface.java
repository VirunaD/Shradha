package com.csi.thread;

public class RunnableInterface implements Runnable{
	public void run()
	{
		int i;
		for(i=1;i<=5;i++)
		{
			try {
				Thread.sleep(10000);
				System.out.println("CSI");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableInterface RI=new RunnableInterface();
		Thread tt=new Thread(RI);
		tt.start();
	}

}
