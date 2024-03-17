package com.logic;

public class Pattern114 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
}
