package ExceptionHandling;

//import java.io.IOException;

public class ExceptionPropogation1 {
void m() 
{
	//throw new java.io.IOException("Device error");//By default, Checked Exceptions are not forwarded in calling chain (propagated) so that error is occur
}
void n() 
{
	m();
}
void p()
{
	try
	{
		n();
	}
	catch(Exception e)
	{
		System.out.println("Exception Handled");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExceptionPropogation1 ep=new ExceptionPropogation1();
ep.p();
System.out.println("Normal Handled");
	}

}
