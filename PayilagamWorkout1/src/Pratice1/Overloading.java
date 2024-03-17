package Pratice1;

public class Overloading {
public void m1() {
	System.out.println("hi");
}
public void m1(int i) {
	System.out.println(i);
}
public void m1(int i,int j) {
	System.out.println(i+j);
}
public void m1(String n,int i) {
	System.out.println(n+"\n"+i);
}
public void m1(int i,String n) {
	System.out.println(i+"\n"+n);
}
public static void main(String args[])
{
	Overloading v=new Overloading();
	v.m1();v.m1(2);
	v.m1(20,30);
	v.m1("mano",80);
	v.m1(45,"mano");
}
}
