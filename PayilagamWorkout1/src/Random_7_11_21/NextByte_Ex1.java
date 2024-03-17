package Random_7_11_21;

import java.util.Random;

public class NextByte_Ex1 {
	public static void main(String[] args) {  
        Random random = new Random();  
byte[] bytes = new byte[10];  
random.nextBytes(bytes);  
System.out.print("Random bytes = ( ");  
for(int i = 0; i<bytes.length; i++)  
        {  
System.out.printf("%d ", bytes[i]);  
        }  
System.out.print(")");  
    }  
}
//Random bytes = ( 42 0 99 50 -121 112 -4 -39 78 -79 )