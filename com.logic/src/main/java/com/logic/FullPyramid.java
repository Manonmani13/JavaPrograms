package com.logic;

public class FullPyramid {
public static void main(String[] args) {
	int m=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<=4;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=m;j++)
			{
				System.out.print("*");
			}
			m+=2;
			System.out.println();
		}
		
}
}
