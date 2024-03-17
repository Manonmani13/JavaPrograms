package Practice11;
class Cook
{
	int mark=30;
	public Cook()
	{
		System.out.println("Cook from  default constructor");
	}
	public Cook(int i)
	{
		this();
System.out.println(" cooking"+i); 
	}
public void cooking()
{
System.out.println(" learn cooking");
}
}
public class Mother extends Cook {
	Mother()
	{
	System.out.println("Mother cooking"); 
	}
	Mother(int i)
	{
	super(50);
	System.out.println("Mother cooking"+i); 
	}
	public void m()
	{
	System.out.println(super.mark);
	}
	public static void main(String args[])
	{
	//Cook c=new Mother();
	Mother m=new Mother(90);
	m.m();
	System.out.println(m.mark);
	//c.cooking();
	}
	/*public void cooking()
	{
	System.out.println(" learn cooking from mother");
	}*/
}
