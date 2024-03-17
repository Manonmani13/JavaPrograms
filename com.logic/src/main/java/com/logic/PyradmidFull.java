package com.logic;

public class PyradmidFull {
public static void main(String[] args) {
	int m=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<=4;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=m;k++)
		{
			System.out.print("*");
		}
		m=m+2;
		System.out.println();
	}
	
}
}
