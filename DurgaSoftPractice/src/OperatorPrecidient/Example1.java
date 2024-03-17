package OperatorPrecidient;

public class Example1 {
public static void main(String[] args) {
	/*
	 * 1.unary ->[],x++,--.~,!new,<type>
	 * 2.arithmethic->*,/,%,+,-
	 * 3.shift->>>,>>>,<<
	 * 4.comaprison-><,<=,>,>=,instancdof
	 * 5.equalit->==,!=
	 * 6.bitwise->&,^,|
	 * 7.short circuit->&&,||
	 * 8.conditional->?:
	 * 9.assignment =,+=,-=,*=,/=.....
	 */
	System.out.println(m1(1)+m1(2)*m1(3)/m1(4)+m1(5)*m1(6));
	
}
static int m1(int i)
{
	System.out.println(i);
	return i;
}
}
