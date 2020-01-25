package ExceptionHandling;

import java.io.IOException;

//case 2: b)In case we declare the exception if exception occurs, an exception will be thrown at runtime because throws does not handle the exception.
class P
{
	void Method() throws IOException
	{
		throw new IOException("Device Error");
	}
}
public class Throws3Concept {

	public static void main(String[] args) throws IOException {
	
P p=new P();
p.Method();
System.out.println("Normal FLow");
	}
}
