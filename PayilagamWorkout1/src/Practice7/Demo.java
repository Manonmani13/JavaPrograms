package Practice7;

public class Demo {
static int rollno=99;
Demo()
{
	System.out.println("Default constructor");
}
Demo(int mark)
{
	this();
	System.out.println("Demo parameter constructor");
	
}
public static void main(String[] args) {
	Demo d=new Demo(88);
	d.print();
}
public void print()
{
	System.out.println(this.rollno);
}
}
