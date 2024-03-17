package StringMethos_2;

public class Empty3 {
	public static void main(String argvs[])  
	{  
	String str = null;  
	if(str.isEmpty())  
	{  
	System.out.println("The string is null.");  
	}  
	else  
	{  
	System.out.println("The string is not null.");  
	}  
	}
}
/*
Exception in thread "main" java.lang.NullPointerException
	at StringMethos_2.Empty3.main(Empty3.java:7)

*/