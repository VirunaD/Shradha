package ExceptionHandling;

class Parent1 {
	/*void msg1() throws ArithmeticException //in case subclass overridden method declares parent exception
	 * {
		System.out.println("Parent");
	}
*/
	void msg1() throws Exception //in case subclass overridden method declares same exception
	{
		System.out.println("Parent");
	}

}

class MethodOverridingExceptionCon extends Parent1 {
	
	void msg1() throws Exception {
		System.out.println("Child");
	}

	/*void msg1() throws ArithmeticException//In case subclass overridden method declares subclass exception
	{
		System.out.println("Child");
	}*/
	/*void msg1()  //in case subclass overridden method declares no exception
	{
		System.out.println("Child");
	}*/
	public static void main(String[] args) {
		MethodOverridingExceptionCon moe = new MethodOverridingExceptionCon();
		try {
			moe.msg1();
		} catch (Exception e) {

		}
	}

}
