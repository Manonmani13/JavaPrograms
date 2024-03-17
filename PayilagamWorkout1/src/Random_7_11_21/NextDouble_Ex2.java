package Random_7_11_21;

import java.util.Random;

public class NextDouble_Ex2 {
public static void main(String[] args) {
	Random r=new Random();
	for (double i=0;i<5;i++) {  
		//return the next pseudorandom double value  
		Double val =r.nextDouble();  
		System.out.println(val+" ");  
		        }  
}
}
/*
0.4250112554142115 
0.13022313947507902 
0.8455000931159872 
0.675580036610764 
0.05229418583154799 
*/