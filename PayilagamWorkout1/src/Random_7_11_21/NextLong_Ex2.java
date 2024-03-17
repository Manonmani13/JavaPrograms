package Random_7_11_21;

import java.util.Random;

public class NextLong_Ex2 {
	public static void main(String[] args) {  
	      Random random = new Random();  
	for (double i=0;i<5;i++) {  
	//return the next pseudorandom Gaussian value  
	Long val =random.nextLong();  
	System.out.println(val+" ");  
	      }  
	   }  
}
/*
-8344960643982864183 
-4815744697270455938 
7906769428490925983 
2577371782727988587 
9082825873484694912 
*/