package com.logic;

import java.util.Scanner;

public class SumB2No {
public static void main(String[] args) {
	int n1,n2,s=0;
	Scanner sc=new Scanner(System.in);
	n1=sc.nextInt();
	n2=sc.nextInt();
	for(int i=n1;i<=n2;i++)
		s=s+sumofdigit(i);
	System.out.print(s);
}

private static int sumofdigit(int i) {
	// TODO Auto-generated method stub
	int s=0;
	while(i!=0) {
		s=s+(i%10);
		i=i/10;
	}
	return s;
}
}
