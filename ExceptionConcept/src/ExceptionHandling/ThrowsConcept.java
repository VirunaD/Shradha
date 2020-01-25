package ExceptionHandling;

import java.io.IOException;

//Case 1:  we handle Exception
class M
{
	void method() throws IOException
	{
		throw new IOException("device Error");
	}
}
public class ThrowsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	M m=new M();
	m.method();
}
catch(Exception e)
{
	System.out.println("Exception Handled");
}
System.out.println("Normal Flow");
	}

}
