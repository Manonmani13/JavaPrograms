package NewInstancesOf;

public class Example1 {
public static void main(String[] args) throws Exception {
	//used to create object at runtime
	Object o=Class.forName(args[0]).newInstance();
	System.out.println("object created for "+o.getClass().getName());
}
}
