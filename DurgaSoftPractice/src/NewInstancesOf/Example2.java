package NewInstancesOf;

public class Example2 {
public static void main(String[] args) throws Exception {
	//instance used to know type  of object and we know type at the begining
	//isinstance dont the what type of object in that it will use
	Thread t=new Thread();
	System.out.println(t instanceof Runnable);
	System.out.println(Class.forName(args[0]).isInstance(t));
	
}
}
