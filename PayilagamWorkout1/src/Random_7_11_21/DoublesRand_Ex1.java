package Random_7_11_21;

import java.util.Random;

public class DoublesRand_Ex1 {
	public static void main(String[] args) {  
		//create random object  
		Random random= new Random();  
		// will return a pseudorandom double value btw zero and one  
		for (int i=1;i<5;i++) {  
		System.out.println(i+". "+random.doubles());  
		        }  
		    }  
}
/*
1. java.util.stream.DoublePipeline$Head@3cd1a2f1
2. java.util.stream.DoublePipeline$Head@2f0e140b
3. java.util.stream.DoublePipeline$Head@7440e464
4. java.util.stream.DoublePipeline$Head@49476842

*/