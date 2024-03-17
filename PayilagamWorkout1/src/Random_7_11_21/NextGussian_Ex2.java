package Random_7_11_21;

import java.util.Random;

public class NextGussian_Ex2 {
	public static void main(String[] args) {  
        Random random = new Random();  
for (double i=0;i<5;i++) {  
//return the next pseudorandom Gaussian value  
Double val =random.nextGaussian();  
System.out.println(val+" ");  
        }  
    } 
}
/*
-0.7987638015728864 
-0.3267114675882198 
-0.10202041723122496 
-0.4873258397822343 
-0.7627003711635469 

*/