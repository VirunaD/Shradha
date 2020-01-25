package ExceptionHandling;
//import java.lang.*;
public class ThrowConcept {
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Valid");
		}
		else
		{
			System.out.println("Welcome for Vote");
		}
	}

	public static void main(String[] args) {
	validate(19);
	System.out.println("rest of the code");
	}

}
