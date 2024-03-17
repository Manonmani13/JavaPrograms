package StringMethods;

public class Compare5 {
	public static void main(String[] args)   
	{  
	   
	String str = null;  
	  
	// null is invoking the compareTo method. Hence, the NullPointerException  
	// will be raised  
	int no =  str.compareTo("India is my country.");  
	  
	System.out.println(no);  
	}  
}
