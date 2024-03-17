package com.logic;

import java.util.Scanner;

public class XsOs {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int xc=0,oc=0,i;
	for(i=0;i<s.length();i++) {
		if(s.charAt(i)=='x')
			xc++;
		if(s.charAt(i)=='o')
			oc++;
	}
	if(xc==0 && oc==0)
		System.out.println(true);
	else if(xc==oc)
		System.out.println(true);
	else
		System.out.println(false);
}
}
