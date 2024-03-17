package Practice7;

public class Demotest  extends Demo{
	int m1,m2,m3,m4;
static String name="jai";
static
{
	System.out.println("This is static block"+name);
}
Demotest()
{
	super();
	System.out.println("Demotest");
	System.out.println(super.rollno);
	System.out.println(this.rollno);
}
Demotest(int m1,int m2)
{
	this.m1=m1;
	this.m2=m2;
	System.out.println(m1+" "+m2);
}
Demotest(int m1,int m2,int m3,int m4)
{
	this(m1,m2);
	this.m3=m3;
	this.m4=m4;
	System.out.println(m1+" "+m2+" "+m3+" "+m4);
}
public static void main(String[] args) {
	System.out.println(name);
	Demotest t=new Demotest(99,33,44,55);
	t.print();
}
public void print()
{
System.out.println(super.rollno);
System.out.println(this.name);
}
}
