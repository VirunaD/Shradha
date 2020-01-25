package ExceptionHandling;

public class NestedTryBlock {
public static void main(String[] args) {
	try
	{
		try
		{
			System.out.println("Going to divided");
			int a=39/0;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
			//e.printStackTrace();
		}
		try
		{
			int a[]=new int [5];
			a[5]=4;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Other Statement");
	}catch(Exception e)
	{
		System.out.println("Handled");
	}
	System.out.println("Normal Flow");
}
}