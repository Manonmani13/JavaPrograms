package Random_7_11_21;

import java.util.Random;

public class NextLong_Ex1 {
	public static void main(String[] args) {  
	      Random random = new Random();  
	//return the next pseudorandom long value  
	Long val = random.nextLong();  
	System.out.println("Random Integer value : "+val);  
	      Long val1 = random.nextLong();  
	System.out.println("Random Integer value : "+val1);  
	   }  
}
/*
Random Integer value : -5819257131198373474
Random Integer value : 6098154740626603304
*/