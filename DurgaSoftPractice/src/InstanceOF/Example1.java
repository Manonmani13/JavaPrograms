package InstanceOF;

public class Example1 {
public static void main(String[] args) {
	Thread t=new Thread();
	System.out.println(t instanceof Thread);
	System.out.println(t instanceof Object);
	System.out.println(t instanceof Runnable );
	//System.out.println(t instanceof String);
	System.out.println(null instanceof Thread);
	System.out.println(null instanceof Object);
	System.out.println(null instanceof Runnable );
}
}
