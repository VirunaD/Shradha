package StringProgram;

public class StringExample {

	public static void main(String[] args) {
String s="Java";//by using java string literal
char ch[]={'s','t','r','i','n','g'};//Converting Char to String
String s1=new String(ch);
String s2=new String("Example");//by Using java new keyword, stored in heap memory
s.concat(s1);//concat() method appends the string at the end
//s=s.concat(s1);//if we explicitly assign it to the reference variable, it will refer to new object
System.out.println(s);// will print java because strings are immutable objects
System.out.println(s1);
System.out.println(s2);
//System.out.println(s1);
	}

}
