package com.logic;

import java.util.Scanner;

public class Perfect {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print(Perfect(sc.nextInt()));
}
static int Perfect(int n) {
	int s=0;
	for(int i=1;i<n;i++) {
		if(n%i==0)
			s=s+i;
	}
	if(s==n)
		return 1;
	else 
		return 0;
}
}
