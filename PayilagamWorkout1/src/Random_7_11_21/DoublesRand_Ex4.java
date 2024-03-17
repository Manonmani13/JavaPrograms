package Random_7_11_21;

import java.util.Random;
import java.util.stream.DoubleStream;

public class DoublesRand_Ex4 {
	static int i=1;  
	public static void main(String[] args) {  
	double randomNumberOrigin=1;  
	double randomNumberBound=7;  
	long streamSize=12358;  
	         Random random=new Random();  
	DoubleStream d1=random.doubles(randomNumberOrigin,randomNumberBound);  
	/*returns a stream producing given streamsize number 
	        of pseudorandom double value*/  
	DoubleStream d2 =random.doubles(streamSize);  
	/*returns a stream producing given streamsize number 
	        of pseudorandom double value, each between the given origin 
	        and bound*/  
	DoubleStream d3 =random.doubles(streamSize,randomNumberOrigin,randomNumberBound);  
	System.out.println(i+". "+d1);  
	System.out.println(i+1 +". "+d2);  
	System.out.println(i+2+". "+d3);  
	        }  
}
/*
1. java.util.stream.DoublePipeline$Head@3cd1a2f1
2. java.util.stream.DoublePipeline$Head@2f0e140b
3. java.util.stream.DoublePipeline$Head@7440e464
*/