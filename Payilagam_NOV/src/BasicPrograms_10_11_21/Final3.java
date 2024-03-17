package BasicPrograms_10_11_21;

public class Final3 {
public static void main(String[] args) {
	try
	{
		System.out.println("inside try block");
		int d=25/0;
		System.out.println(d);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception handled");
		System.out.println(e);
	}
	finally {
		System.out.println("finally block always execute");
	}
	System.out.println("end of the program");
}
}
/*
inside try block
Exception handled
java.lang.ArithmeticException: / by zero
finally block always execute
end of the program

*/