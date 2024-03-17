package AccessModifierPack;

public class FinalVariables1 {
	int x;
	final int d=3;//we have to initialize the variable
	/*
	 * instance variables might not have been intialized 
	 *but final variable must be intialized before constructor complition
	 *	*/
public static void main(String[] args) {
FinalVariables1 n=new FinalVariables1();
System.out.println(n.x);
}
}
