package StringMethods;

public class Char5 {
public static void main(String[] args) {
	 String str = "Welcome to Java journey";  
     int count = 0;  
     for (int i=0; i<=str.length()-1; i++) {  
         if(str.charAt(i) == 't') {  
             count++;  
         }  
     }  
     System.out.println("Frequency of t is: "+count); 
     System.out.println(str.charAt(0));

}
public char charAt(int index)  
{
	return 'a';
}
}
//Frequency of t is: 1