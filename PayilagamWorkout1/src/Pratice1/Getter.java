package Pratice1;

public class Getter {
	private int resultmark=350;
	int getResultmark()
	{
	System.out.println(resultmark);
	return resultmark;
	}
	public void setResultmark(int mark)
	{
	 resultmark=resultmark+mark;
		System.out.println(resultmark);
	}
public static void main(String args[])
{
	Getter n=new Getter();
	//int ma=n.getResultmark();
	//System.out.println(ma);
	System.out.println(n.resultmark);
	n.setResultmark(70);
	System.out.println(n.resultmark);
	Getter n1=new Getter();
	System.out.println(n1.resultmark);
	n1.setResultmark(2000);
	System.out.println(n1.resultmark);
	
}
}
