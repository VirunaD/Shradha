package ExceptionHandling;

public class ExceptionConcept {

	public static void main(String[] args) {
		int result;
		try {
			result = 10 / 2;
			System.out.println("Result:" + result);
		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {

		} finally {
			System.out.println("Always Execute");
		}
		isAgeValidforvote(13);
	}
	static void isAgeValidforvote(int age) throws NullPointerException, ArrayIndexOutOfBoundsException {
	 if (age <18)
	 {
		 try
		 {
			 throw new AgeInvalidForVote();
		 }catch(AgeInvalidForVote e)
		 {
			 System.out.println(e);
		 }
	 }
	 else
	 {
		 System.out.println("Eligible for Vote");
	 }
	}
}
