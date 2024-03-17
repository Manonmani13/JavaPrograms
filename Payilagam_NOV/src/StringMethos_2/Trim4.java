package StringMethos_2;

public class Trim4 {
	public static void main(String argvs[])  
	{  
	  
	String str = " abc ";  
	  
	if((str.trim()).length() > 0)  
	{  
	System.out.println("The string contains characters other than white spaces \n");  
	}  
	else  
	{  
	System.out.println("The string contains only white spaces \n");     
	}  
	  
	str = "    ";  
	  
	if((str.trim()).length() > 0)  
	{  
	System.out.println("The string contains characters other than white spaces \n");  
	}  
	else  
	{  
	System.out.println("The string contains only white spaces \n");     
	}  
	  
	}  
}
/*
The string contains characters other than white spaces 

The string contains only white spaces 


*/