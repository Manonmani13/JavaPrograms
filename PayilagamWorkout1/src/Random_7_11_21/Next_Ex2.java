package Random_7_11_21;

import java.util.Random;

public class Next_Ex2 extends Random{
	static  int i=1;  
	public static void main(String[] args) {  
	       Next_Ex2 random = new Next_Ex2();  
	System.out.println(i+". Next value returns = "+random.next(9));  
	System.out.println(i+1 +". Next value returns = "+random.next(0x9));  
	System.out.println(i+2 +". Next value returns = "+random.next(011));  
	System.out.println(i+3 +". Next value returns = "+random.next(01001));  
	    }  
}
/*
1. Next value returns = 450
2. Next value returns = 266
3. Next value returns = 383
4. Next value returns = 0

*/