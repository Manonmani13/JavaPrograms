package Random_7_11_21;

import java.util.Random;

public class NextBool_Ex1 {
	public static void main(String[] args) {  
        Random random = new Random();  
boolean val = random.nextBoolean();  
System.out.println("Random booleanvalue : "+val);  
boolean val1 = random.nextBoolean();  
System.out.println("Random Boolean value : "+val1);  
    }  
}
/*
Random booleanvalue : false
Random Boolean value : false
*/