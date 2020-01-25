package StringProgram;

public class StringCompareConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Aruna";
		String s2 = "Aruna";
		String s3 = new String("Arun");
		String s4 = "Vishal";
		String s5 = "ARUNA";
		String s= "Vishal" + "Deokar";
		String s6=30+20+"Abhi"+30+20;
		
		//.equals Operator
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		
		
		//== operator
		
		System.out.println(s1 == s2);// true(because both refer to same
										// instance)
		System.out.println(s1 == s3);// false (because s3 refers to instance
										// created in non pool)
		
		//CompareTo operator
		
		System.out.println(s1.compareTo(s2));// 0(because s1==s2)
		System.out.println(s1.compareTo(s4));// -21(because s1<s4)
		System.out.println(s4.compareTo(s1));// 21(because s4>s1)
		// System.out.println(s1.compareTo(s3));
		
		//Concat Operator
		System.out.println(s);
		System.out.println(s1.concat(s4));
		
		System.out.println(s6);//50Abhi3020
	}

}
