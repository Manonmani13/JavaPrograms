package BasicPrograms_10_11_21;

public class Try3 {
public static void main(String[] args) {
	try
	{
		int data=40/0;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("rest of the code");
}
}
/*
java.lang.ArithmeticException: / by zero
rest of the code
*/