package com.logic;

public class NumberPattern2 {
public static void main(String[] args) {
	int m=1;
	for(int i=7;i>=1;i--){
		for(int k=i;k<=7;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();

	}
}
}
