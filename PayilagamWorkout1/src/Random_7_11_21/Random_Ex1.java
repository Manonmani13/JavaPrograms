package Random_7_11_21;

import java.util.Random;

public class Random_Ex1 {
public static void main(String[] args) {
	  Random random= new Random();
	  System.out.println("Longs value : "+random.longs());
	  boolean val = random.nextBoolean();  
      System.out.println("Random boolean value : "+val);  
}
}
//Longs value : java.util.stream.LongPipeline$Head@3cd1a2f1
//Random boolean value : true