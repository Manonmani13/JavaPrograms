package BasicPrograms_10_11_21;

public class Throw1 {
public static void main(String[] args) {
	Throw1 n=new Throw1();
	n.checknum(-1);
}
public void checknum(int n)
{	
	if(n<1)
	{
		throw new ArithmeticException("cannot be do");
	}
	else
	{
		System.out.println("Square of " + n + " is " + (n*n));
	}
}
}
/*
Exception in thread "main" java.lang.ArithmeticException: cannot be do
	at BasicPrograms_10_11_21.Throw1.checknum(Throw1.java:12)
	at BasicPrograms_10_11_21.Throw1.main(Throw1.java:6)

*/