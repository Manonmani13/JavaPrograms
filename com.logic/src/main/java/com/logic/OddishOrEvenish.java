package com.logic;

import java.util.Scanner;

public class OddishOrEvenish {
static int sum(int n)
{
	int s=0;
	while(n!=0)
	{
		s=n%10;
		n/=10;
	}
	return s;
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println(sum(sc.nextInt())%2==0?"Evenish":"Oddish");
}
}
