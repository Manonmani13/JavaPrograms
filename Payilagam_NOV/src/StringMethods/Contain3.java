package StringMethods;

public class Contain3 {
	public static void main(String[] args) {          
        String str = "To learn Java visit Javat.com";        
        if(str.contains("Java.com")) {  
            System.out.println("This string contains java.com");  
        }else  
            System.out.println("Result not found");       
    }  
}
//Result not found