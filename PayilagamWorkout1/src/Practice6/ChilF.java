package Practice6;
abstract class Father{
	public abstract void buyland();
}
public class ChilF  extends Father{
public void buyland()
{
	System.out.println("buy land soon");
}
public static void main(String args[])
{
	ChilF f=new ChilF();
	f.buyland();
}
}
