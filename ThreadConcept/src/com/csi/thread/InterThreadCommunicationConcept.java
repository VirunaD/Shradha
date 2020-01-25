package com.csi.thread;
class Customer
{
	int amount=10000;
	synchronized public void Withdrow(int amount)
	{
		System.out.println("Going to Withdrow money");
		if(this.amount<=amount)
		{
			System.out.println("Insufficient Balance Please Wait");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("Withdrow Successfully");
	}
	synchronized public void deposite(int amount)
	{
		System.out.println("Going to Deposite money");
		this.amount+=amount;
		System.out.println("Deposite Successfully");
		notify();
	}
}
public class InterThreadCommunicationConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer cc=new Customer();
new Thread()
{
	public void run()
	{
		cc.Withdrow(15000);
	}
}.start();
new Thread()
{
	public void run()
	{
		cc.deposite(10000);
	}
}.start();
	}

}
