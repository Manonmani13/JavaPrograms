package Oct_17_10_2021;

public class Equals_method {
public static void main(String[] args) {
	String s1="javatpoint";  
	String s2="javatpoint";  
	String s3="JAVATPOINT";  
	String s4="python";  
	int i=10,k=10;

	System.out.println(s1.equals(s2));//true because content and case is same  
	System.out.println(s1.equals(s3));//false because case is not same  
	System.out.println(s1.equals(s4));	
	//System.out.println(i.equals(k));
}
}
