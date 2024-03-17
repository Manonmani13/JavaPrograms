package Random_7_11_21;

import java.util.Random;

public class NextByte_Ex3 {
	public static void main(String[] args) {  
        Random random = new Random();  
byte[] bytes = new byte[10];  
random.nextBytes(bytes);  
System.out.print("Random bytes = ( ");  
for(int i = 01; i<10; i++)  
        {  
System.out.printf("%d ", bytes[i]);  
        }  
System.out.print(")");  
    }  
}
//Random bytes = ( -100 -8 26 -120 -57 -7 126 -42 -2 )