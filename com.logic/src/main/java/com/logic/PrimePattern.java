package com.logic;

public class PrimePattern {
public static void main(String[] args) {
	int a[]= {2,3,5,7,2,3,5,7,2,3,5,7,2,3,5,7,2,3,5,7,2,3,5,7,2,3,5,7};
	int k=0;
	for(int j=1;j<=5;j++)
	{
		for(int l=1;l<=5;l++)
		{
			System.out.print(a[k]);
			k++;
		}
		System.out.println();
	}
}
}
