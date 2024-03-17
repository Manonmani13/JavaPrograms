package StringMethos_2;

public class Length3 {
	public static void main(String argvs[])  
	{  
	String str = "Welcome To JavaTpoint";  
	int size = str.length();  
	  
	System.out.println("Reverse of the string: " + "'" + str + "'" + " is");  
	  
	for(int i = 0; i < size; i++)  
	{  
	// printing in reverse order  
	System.out.print(str.charAt(str.length() - i - 1));  
	}  
	  
	}  
}
/*
Reverse of the string: 'Welcome To JavaTpoint' is
tniopTavaJ oT emocleW
*/