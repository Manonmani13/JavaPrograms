package Practice11;
import Practice12.Relative;
public class RelativeDaughter extends Relative {
	

	RelativeDaughter(int j)
	{
	super(j);
	System.out.println(j);
	}

	public static void main(String args[])
	{
	RelativeDaughter  rs=new RelativeDaughter(80);

	rs.garden();
	rs.receivepeople();
	}
}
