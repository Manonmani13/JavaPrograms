package com.logic;

public class Not {
	public static void main(String[] args) {
		int k=0,i=0;
		int a[]=new int[100];
		
			for(int j=1;j<=5;j++)
			{
				if(prime(k))
					a[i]=j++;
 				
			}
			for(int h=0;h<5;h++)
			{
				System.out.println(a[i]);
			}
			k=0;
			for(i=0;i<=5;i++)
			{
				for(int j=i;j<=5;j++)
				{
					System.out.println(a[k]);
					k++;
				}
			}
			
			System.out.println();
	
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
