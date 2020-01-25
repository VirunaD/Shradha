package ExceptionHandling;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
public class CustomException {
	static void validate(int age) throws InvalidAgeException
	{
	if(age<18)
	{
		throw new InvalidAgeException("Invalid");
	}
	else
	{
		System.out.println("welcome to vote");
	}
	}
	public static void main(String[] args) {
try
{
	validate(19);
}catch(Exception e)
{
	System.out.println("Exception Occur: "+e);
}
	}

}
