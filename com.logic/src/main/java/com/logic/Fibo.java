package com.logic;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,i;
		System.out.println(n1+" "+n2);
		for(i=1;i<=5;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
