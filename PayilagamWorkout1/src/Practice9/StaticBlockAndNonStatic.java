package Practice9;

public class StaticBlockAndNonStatic {
	{
		System.out.println("This is non static block");
	}
	static
	{
		System.out.println("static block");
	}
	public static void main(String[] args) {
		System.out.println("i am static main method");
		StaticBlockAndNonStatic n=new StaticBlockAndNonStatic();
	}
}
