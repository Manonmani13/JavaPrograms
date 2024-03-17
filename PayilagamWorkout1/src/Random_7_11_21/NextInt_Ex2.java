package Random_7_11_21;

import java.util.Random;

public class NextInt_Ex2 {
	static int j=1;  
	public static void main(String[] args) {  
	        Random random = new Random();  
	for (int i=1;i<8;i++) {  
	//return the next pseudorandom Integer value  
	Integer  val =random.nextInt(i);  
	System.out.println(j++ +". Random intvalue : "+val+" ");  
	        }  
	    }  
}
/*
static int j=1;  
public static void main(String[] args) {  
        Random random = new Random();  
for (int i=1;i<8;i++) {  
//return the next pseudorandom Integer value  
Integer  val =random.nextInt(i);  
System.out.println(j++ +". Random intvalue : "+val+" ");  
        }  
    }  
*/