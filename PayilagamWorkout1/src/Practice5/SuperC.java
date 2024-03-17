package Practice5;

public class SuperC {
	int i,j;
SuperC()
{
	System.out.println("Default constructor");
}
SuperC(int i)
{
	this();
	this.i=i;
	System.out.println(i);
}
SuperC(int i,int j)
{
	this(50);
	this.i=i;
	this.j=j;
	System.out.println();
}

}
