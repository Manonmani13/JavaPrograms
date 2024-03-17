package com.logic;

public class PrimeAndLogic {
public static void main(String[] args) {
	int k;
	for(int i=1;i<=5;i++)
	{
		k=i;
		for(int j=1;j<=5;j++)
		{
			if(prime(k))
				System.out.print(k);
			else
				System.out.print("*");
				
		}
		
		System.out.println();
	}
}
static boolean prime(int  n)
{
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}
}
