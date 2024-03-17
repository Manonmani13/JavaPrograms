package Practice12;

class A
{
public void depart()
{
System.out.println("Bio");
}
}

class B extends A
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
 interface C 
{
public void hello1();
}
public class D extends B implements C
{
public static void main(String args[])
{
D p=new  D();
p.depart();
p.lib();
p.hello1();
}
public void hello1()
{
	System.out.println("hello");
}


}


