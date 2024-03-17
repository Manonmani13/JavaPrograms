package Accessmodifiers;

public class AbstractMetho extends Abtra {
public void m1()
{
	System.out.println("hello");
	
}
public static void main(String[] args) {
	AbstractMetho m=new AbstractMetho();
	m.m1();
	//abstract class can contain final method 
}
}
final class test
{
	//public abstract void m11();error
}
abstract class Abtra
{
	//public abstract void m1() {} error
	public abstract void m1();
	final void m2()
	{
		
	}
}