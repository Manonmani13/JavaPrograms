package com.logic;

import java.util.Scanner;

public class MaximumOccurance {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int a[]=new int[256];
	int i,m;
	for(i=0;i<s.length();i++) {
		a[(int)s.charAt(i)]++;
	}
	for(i=0,m=0;i<256;i++) {
		if(a[i]>a[m]) {
			m=i;
		}
	}
	System.out.println((char)m);
}
}
