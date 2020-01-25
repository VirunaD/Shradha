package ExceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int a[]=new int [5];
	a[5]=50;
}
catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e)
{
	System.out.println(e);
}
System.out.println("Rest of the code");
	}

}
