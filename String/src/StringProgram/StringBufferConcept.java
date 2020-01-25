package StringProgram;

public class StringBufferConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer("Java");
//System.out.println(sb.capacity());//default capacity=16
sb.append("Program");//javaProgram
sb.insert(2, "Hello");
sb.replace(1, 4, "Aruna");
sb.delete(1, 3);
sb.reverse();
System.out.println(sb);

	}

}
