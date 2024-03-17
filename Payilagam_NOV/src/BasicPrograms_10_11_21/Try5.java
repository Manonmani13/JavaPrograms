package BasicPrograms_10_11_21;

public class Try5 {
public static void main(String[] args) {
	  
	        int i=50;  
	        int j=0;  
	        int data;  
	        try  
	        {  
	        data=i/j; //may throw exception   
	        }  
	            // handling the exception  
	        catch(Exception e)  
	        {  
	             // resolving the exception in catch block  
	            System.out.println(i/(j+2));  
	        }  
}
}
//25