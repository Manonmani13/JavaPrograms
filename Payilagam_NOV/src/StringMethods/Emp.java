package StringMethods;

public  final class Emp {
	final String pancardNumber;    
	public Emp(String pancardNumber)  
	{    
	this.pancardNumber=pancardNumber;    
	}  
	public String getPancardNumber(){    
	return pancardNumber;    
	}    
	}    
 class ImmutableDemo  
	{  
	public static void main(String ar[])  
	{  
	Emp e = new Emp("ABC123");  
	String s1 = e.getPancardNumber();  
	System.out.println("Pancard Number: " + s1);  
	} 
}
/*


 */