package Random_7_11_21;

import java.util.Random;

public class NextDouble_Ex1 {
	public static void main(String[] args) {  
        Random random = new Random();  
//return the next pseudorandom double value  
Double val = random.nextDouble();  
System.out.println("Random Double value : "+val);  
        Double val1 = random.nextDouble();  
System.out.println("Random Double value : "+val1);  
    }  
}
/*
Random Double value : 0.03798343870780163
Random Double value : 0.9959385662711778
*/