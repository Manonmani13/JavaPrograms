package Random_7_11_21;
import java.util.*;
import java.util.stream.DoubleStream;
public class DoubleRand_Ex5 {
	public static void main(String[] args) {  
		double randomNumberOrigin=1;  
		double randomNumberBound=12;  
		//size must be non-negative  
		long streamSize=9;  
		        Random random=new Random();  
		DoubleStream d1=random.doubles(randomNumberOrigin,randomNumberBound);  
		DoubleStream d2 =random.doubles(streamSize);  
		DoubleStream d3 =random.doubles(streamSize,randomNumberOrigin,randomNumberBound);  
		System.out.println(d1);  
		System.out.println(d2);  
		System.out.println(d3);  
		System.out.println(Math.random());  
	}

}
/*
java.util.stream.DoublePipeline$Head@3cd1a2f1
java.util.stream.DoublePipeline$Head@2f0e140b
java.util.stream.DoublePipeline$Head@7440e464
0.32839357219218457

*/