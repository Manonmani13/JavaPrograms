package Random_7_11_21;

import java.util.Random;

public class NextInt_Ex1 {
	public static void main(String[] args) {  
        Random random = new Random();  
//return the next pseudorandom integer value  
Integer val = random.nextInt();  
System.out.println("Random Integer value : "+val);  
        Integer val1 = random.nextInt();  
System.out.println("Random Integer value : "+val1);  
    }  
}
/*
Random Integer value : -950862417
Random Integer value : 288674745
*/