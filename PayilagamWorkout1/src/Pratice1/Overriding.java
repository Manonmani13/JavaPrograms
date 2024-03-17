package Pratice1;

public class Overriding {
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
		Overriding v=new Overriding();
		v.m1();v.m1(20);
		v.m1(2,3);
		v.m1("manonmani",8);
		v.m1(45,"manonamani");
	}
}
