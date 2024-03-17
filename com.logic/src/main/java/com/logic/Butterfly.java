package com.logic;

public class Butterfly {
public static void main(String[] args) {
	int k=2;	
	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=i;j++) {
			if(i<=5)
				System.out.print("*");
			else if(i>=6) {
				System.out.print();

			}
		}
	}
}
}
