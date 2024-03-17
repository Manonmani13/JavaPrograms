package String_28_10_21;

public class Length_3 {
	public static void main(String argvs[])  
	{  
	String str = "Welcome To manonmani world ";  
	int size = str.length();  
	  
	System.out.println("Reverse of the string: " + "'" + str + "'" + " is");  
	  
	for(int i = 0; i < size; i++)  
	{    
	System.out.print(str.charAt(str.length() - i - 1));  
	}  
	  
	}  
}
/*
Reverse of the string: 'Welcome To manonmani world ' is
 dlrow inamnonam oT emocleW

*/