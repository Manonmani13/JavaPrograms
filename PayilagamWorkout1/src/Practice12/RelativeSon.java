package Practice12;

public class RelativeSon extends Relative{
	public static void main(String args[])
	{
	RelativeSon rs=new RelativeSon();
	System.out.println(rs.i);
	rs.garden();
	rs.receivepeople();
	rs.Hello();
	}
	public void garden()
	{
	System.out.println("Gardening in organic way");
	}
	void Hello()
	{
	System.out.println("This is model class");
	}
}
