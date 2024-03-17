package StringMethos_2;

public class Substring2 {
public static void main(String[] args) {
	String s1="Javatpoint";    
    String substr = s1.substring(0); // Starts with 0 and goes to end  
    System.out.println(substr);  
    String substr2 = s1.substring(5,10); // Starts from 5 and goes to 10  
    System.out.println(substr2);    
    String substr3 = s1.substring(5,15); // Returns Exception  
}
}
/*
Javatpoint
point
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 5, end 15, length 10
	at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3319)
	at java.base/java.lang.String.substring(String.java:1874)
	at StringMethos_2.Substring2.main(Substring2.java:10)

*/