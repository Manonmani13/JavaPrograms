package Operators;

public class Increment3 {
public static void main(String[] args) {
	byte a=10,b=20;
	byte c=(byte) (a+b);//error
	System.out.println(c);
	byte b1=10;
	b1=(byte) (b1+1);
	System.out.println(b1);
	byte d=10;
	d++;
	System.out.println(d);
	System.out.println(10/0);
}
}
