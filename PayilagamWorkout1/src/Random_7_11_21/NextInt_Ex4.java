package Random_7_11_21;

import java.util.Random;

public class NextInt_Ex4 {
	public static void main(String[] args) {  
        Random random = new Random();  
//return the next pseudorandom integer value  
Integer val = random.nextInt(0);  
System.out.println("Random Integer value : "+val);  
	}
}
