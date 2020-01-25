package ExceptionHandling;

import java.io.IOException;

public class ThrowsException {
void m() throws IOException
{
	throw new IOException("Device error");
}
void n() throws IOException
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
ThrowsException te=new ThrowsException();
te.p();
System.out.println("Normal Flow");
	}

}
