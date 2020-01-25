package ExceptionHandling;

public class ExceptionPropogation {
void m()
{
	int data=37/0;
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
	catch(ArithmeticException e)
	{
		//System.out.println(e);
		//e.printStackTrace();
		System.out.println("Exception Handled");
	}
}
	public static void main(String[] args) {
		ExceptionPropogation ep=new ExceptionPropogation();
		ep.p();
		System.out.println("Normal flow");
	}

}
