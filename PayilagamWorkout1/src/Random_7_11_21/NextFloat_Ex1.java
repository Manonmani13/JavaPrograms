package Random_7_11_21;

import java.util.Random;

public class NextFloat_Ex1 {
	public static void main(String[] args) {  
        Random random = new Random();  
//return the next pseudorandom float value  
Float val = random.nextFloat();  
System.out.println("Random Float value : "+val);  
        Float val1 = random.nextFloat();  
System.out.println("Random Float value : "+val1);  
    }  
}
/*
Random Float value : 0.18635559
Random Float value : 0.5897482
*/