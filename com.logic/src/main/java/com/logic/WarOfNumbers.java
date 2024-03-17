package com.logic;

import java.util.Scanner;

public class WarOfNumbers {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	System.out.println(war(a,n));
	
}
static int war(int a[],int n)
{
int i,se=0,so=0,diff=0;
for(i=0;i<n;i++)
{
if(a[i]%2==0)
se=se+a[i];
else
so=so+a[i];
}
diff=se-so;
if(diff<0)
return -diff;
else
return diff;
 
}
}
