package Random_7_11_21;

import java.util.Random;
import java.util.stream.DoubleStream;

public class DoublesRand_Ex3 {
	public static void main(String[] args) {  
		double randomNumberOrigin=1;  
		//bound must be greater than origin  
		double randomNumberBound=5;  
		        Random random=new Random();  
		/*returns a stream of pseudorandom double value 
		        conforming to the given origin and bound */  
		DoubleStream d1=random.doubles(randomNumberOrigin,randomNumberBound);  
		System.out.println(d1);  
		    }  
}
//java.util.stream.DoublePipeline$Head@3cd1a2f1
