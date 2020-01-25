package ExceptionHandling;

import java.io.IOException;

//Case 2: A]in case we declare exception, if exception does not occur, the code will be executed fine
class N {
	void Method() throws IOException //no matter throw exception writer or not
	{
		System.out.println("Device Opration Performed");
	}
}

public class Throws2Concept {

	public static void main(String[] args) throws IOException  //no matter throw exception writer or not
	{
		// TODO Auto-generated method stub
		N n = new N();
		n.Method();
		System.out.println("Normal flow");
	}

}
