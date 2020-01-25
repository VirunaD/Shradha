package ExceptionHandling;

import java.io.IOException;

//If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.
//but can declare unchecked exception.
class Parent {
	void msg() {
		System.out.println("Parent");
	}
}

public class MethodOverridingException extends Parent {
	/*
	 * void msg() throws IOException (Checked Exception) {
	 * System.out.println("Child"); }
	 */// Compile time Error
	void msg() throws ArithmeticException// unchecked exception
	{
		System.out.println("Child");
	}

	public static void main(String[] args) {
		Parent pp = new MethodOverridingException();
		pp.msg();
	}

}
