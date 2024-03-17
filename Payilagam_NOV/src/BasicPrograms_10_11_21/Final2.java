package BasicPrograms_10_11_21;

public class Final2 {
public static void main(String[] args) {
	try
	{
		System.out.println("inside try block");
		int da=11/0;
		System.out.println(da);
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	finally {
		System.out.println("finally block is always executed");
	}
	System.out.println("rest of the code");
}
}
/*
inside try block
finally block is always executed
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at BasicPrograms_10_11_21.Final2.main(Final2.java:8)

*/