package Random_7_11_21;

import java.util.Random;

public class Rand_Ex3 {
	public static void main(String[] args) {  
	      Random random = new Random();  
	      //return the next pseudorandom integer value  
	      System.out.println("Random Integer value : "+random.nextInt());  
	      // setting seed  
	      long seed =20;  
	      random.setSeed(seed);  
	      //value after setting seed  
	      System.out.println("Seed value : "+random.nextInt());  
	      //return the next pseudorandom long value  
	      Long val = random.nextLong();  
	      System.out.println("Random Long value : "+val);  
	}
}
/*
Random Integer value : -1174888399
Seed value : -1150867590
Random Long value : -7322354119883315205
*/