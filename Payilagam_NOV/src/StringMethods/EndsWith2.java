package StringMethods;

public class EndsWith2 {
	public static void main(String[] args) {  
        String str = "Welcome to Java.com";  
        System.out.println(str.endsWith("Java"));  
        if(str.endsWith(".com")) {  
            System.out.println("String ends with .com");  
        }else System.out.println("It does not end with .com");  
    }  
}
/*
false
String ends with .com

*/