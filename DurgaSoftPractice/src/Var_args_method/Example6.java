package Var_args_method;

public class Example6 {
	public static void m1(int ...x)
	{
		System.out.println("Var args method.");
	}
	public static void m1(int x)
	{
		System.out.println("General method");
	}
	public static void main(String[] args) {
		m1();
		m1(10,20);
		m1(10);
	}
}
