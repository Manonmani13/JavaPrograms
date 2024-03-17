package Practice9;

public class Staticblock {
	Staticblock()
	{
	System.out.println("hello from constructor");	
	}
	static
	{
	System.out.println("hello");
	}
		static
	{
	System.out.println("hello2");
	}
	{
	System.out.println("hello from non static");
	}
		{
	System.out.println("hello from non static 2");
	}
	public  static void main(String[]args)
	{
	System.out.println("Hi from main");
	Staticblock b=new Staticblock();
		Staticblock b1=new Staticblock();
	}
	 static void m1()
	{
		System.out.println("hello frun nethid");
	}
}
