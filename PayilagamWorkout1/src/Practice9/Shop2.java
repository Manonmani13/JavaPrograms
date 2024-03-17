package Practice9;

public class Shop2 extends Tv1{
	public static void main(String args[])
	{
	Shop2 customer=new Shop2();
	customer.delivery();
	customer.getTv();
	}
	public Tv1 getTv()
	{
	System.out.println("take tv sona pothuma we have to give ");
	Tv1 sony=new Tv1();
	return sony;
	}
	}

	class Tv1
	{
	public void delivery()
	{
	System.out.println("free for delivery"	);
	}
}
