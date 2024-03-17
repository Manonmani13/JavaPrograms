package Practice11;
class Parent
{
public void depart()
{
System.out.println("Bio");
}
}
class Gopi extends Parent
{
public void depart()
{
System.out.println("CS");
}
public void lib()
{
System.out.println("lib");
}
}
public class Kumar extends Parent {
	public static void main(String args[])
	{
	 Kumar p=new  Kumar();
	p.depart();
	//p.lib();
	}
}
