package com.logic;

public class StarReverse7 {
public static void main(String[] args) {
	for(int i=7;i>=1;i--)
	{
		for(int j=i;j<=7;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
