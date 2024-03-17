package com.logic;

import java.util.Scanner;

public class StringSuffle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int a[]=new int[s.length()];
	for(int i=0;i<s.length();i++)
		a[i]=sc.nextInt();
	char b[]=new char[s.length()];
	for(int i=0;i<s.length();i++) {
		b[a[i]]=s.charAt(i);
	}
	System.out.println(new String(b));
}
}
