package com.logic;

public class SmallAlphabet {
	public static void main(String[] args) {
		int k=96;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print((char)(j+k++));
			}
			System.out.println();
		}
	}
}
