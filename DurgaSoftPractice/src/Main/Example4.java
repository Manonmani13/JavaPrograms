package Main;

public class Example4 {
static 
{
	System.out.println("HI");
	System.exit(0);//shutdown jvm
}
public static void main(String[] args) {
	System.out.println("Hello");
	int n=Integer.parseInt(args[0]);
	System.out.println((n*n));
}
}
