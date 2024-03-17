package Practice6;

public class Child extends parent
{
	int i=20;
	static  int l=200;
	public Child() {
		
		System.out.println("Default constructor");
	}
	public Child(int i)
	{
		super(i);
	}
	public void waterheater()
	{
		System.out.println("water heater");
	}
	public void fan()
	{
		System.out.println(" fan");
	}
	public void washing()
	{
		System.out.println(" washing machine");
	}
	public void walk()
	{
		System.out.println("walking");
	}
	public static void main(String[] args) {
		parent p=new Child(80);
		p.fan();
		p.washing();
		p.waterheater();
		
	}
}
