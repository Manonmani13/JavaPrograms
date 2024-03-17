package Practice3;

public class BOO extends HOO{
	static void sell()//final, static,private
	{

	System.out.println("sell the product from Boo");
	}
	public void audit()
	{
	System.out.println("check auditing from BOO");
	}
	public static void main(String args[])
	{
	HOO manager=new BOO();
	BOO n=new BOO();

	manager.sell();
	manager.audit();
	n.lunch();
	}

	 void lunch() {
		System.out.println("take lunch");
	}
}
