package StringMethods;

public class EndWitj {
public static void main(String[] args) {
	if("Welcome to JavaTpoint".endsWith(""))  
	{  
	System.out.println("Inside the if block");  
	}  
	else  
	{  
	System.out.println("Inside the else block");  
	}  
	// invoking the method endsWith() using the string literal  
	if("Welcome to JavaTpoint".endsWith("point"))  
	{  
	System.out.println("Inside the if block");  
	}  
	else  
	{  
	System.out.println("Inside the else block");  
	}  
	// invoking the method endsWith() using the string literal  
	if("Welcome to JavaTpoint".endsWith("xyz"))  
	{  
	System.out.println("Inside the if block");  
	}  
	else  
	{  
	System.out.println("Inside the else block");  
	}  
	
}
}
/*
Inside the if block
Inside the if block
Inside the else block

*/