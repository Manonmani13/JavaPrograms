package Random_7_11_21;

import java.util.Random;

public class Random_Ex2 {
public static void main(String[] args) {
	Random random= new Random();  
	 byte[] bytes = new byte[10];  
     //generates random bytes and put them in an array  
     random.nextBytes(bytes);
     System.out.println(random);
     System.out.print("Random bytes = ( ");  
     for(int i = 0; i< bytes.length; i++)  
     {  
         System.out.printf("%d ", bytes[i]);  
     }  
     System.out.print(")");  
 }  
}
/*
 * java.util.Random@6ff3c5b5
Random bytes = ( 98 68 -93 97 -53 44 52 123 -73 92 )
 */
