package Operators;

public class RunTimeExcep {
public static void main(String[] args) {
	//System.out.println(10/0);//runtime
	System.out.println(10/0.0);//infinity
	System.out.println(0/0);//RE
	System.out.println(0.0/0);	//NAN
	System.out.println(10<Float.NaN);
	System.out.println(10<=Float.NaN);
	System.out.println(10>=Float.NaN);
	System.out.println(10>Float.NaN);
	System.out.println(10==Float.NaN);
	System.out.println(10!=Float.NaN);//true
	System.out.println(Float.NaN==Float.NaN);
	System.out.println(Float.NaN!=Float.NaN);//true
}
}
