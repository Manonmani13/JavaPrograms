package Random_7_11_21;

import java.util.Random;

public class NextGussian_Ex1 {
	public static void main(String[] args) {  
        Random random = new Random();  
//return the next pseudorandom Gaussian value  
Double val = random.nextGaussian();  
System.out.println("Random Gaussian value : "+val);  
double val1 = random.nextGaussian();  
System.out.println("Random Gaussian value : "+val1);  
    }  
}
/*
Random Gaussian value : 1.1994698254044645
Random Gaussian value : 0.978355945493532

*/