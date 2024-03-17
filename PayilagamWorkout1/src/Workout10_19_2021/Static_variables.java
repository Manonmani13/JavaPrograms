package Workout10_19_2021;

public class Static_variables {
	 static int a=20;
	//static variables can be public private  protected default
	 /*
	  * public static int i=20;
	  * private static int j=30;
	  * protected static int k=20;
	  */
	//but cannot be final  final static int a=20;
public static void main(String[] args) {
	a=30;
	System.out.println(a);
}
}
