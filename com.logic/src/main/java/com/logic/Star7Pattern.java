package com.logic;

public class Star7Pattern {
public static void main(String[] args) {
	int m=1;
	for(int i=1;i<=7;i++) {
		for(int j=i;j<=7;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=m;k++)
		{
			System.out.print("*");
		}
		m++;
		System.out.println();
	}
}
}
