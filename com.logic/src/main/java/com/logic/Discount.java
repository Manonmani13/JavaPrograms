package com.logic;

import java.util.Scanner;

public class Discount {
static int discount(int  n)
{
	int d,se=0,so=0;
	while(n!=0)
	{
		d=n%10;
		if(d%2==0)
			se=se+d;
		else
			so=so+d;
		n=n/10;
	}
	return se*so;
	
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println(discount(sc.nextInt()));
}
}
