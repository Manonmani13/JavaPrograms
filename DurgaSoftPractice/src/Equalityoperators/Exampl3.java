package Equalityoperators;

public class Exampl3 {
public static void main(String[] args) {
	Thread t=new Thread();
	Object o=new Object();
	String s=new String("Durga");
	System.out.println(t==o);
	System.out.println(o==s);
	//System.out.println(s==t);
}
}
