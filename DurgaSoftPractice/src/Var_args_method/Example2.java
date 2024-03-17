package Var_args_method;

public class Example2 {
	public static void m1(int ...x)
	{
		System.out.println("no args method"+x.length);
	}
	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,20);
		m1(10,20,30,40);
	}
}
