package com.logic;

import java.util.Scanner;

public class NVowels {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int n=sc.nextInt();
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			sb.append(ch);
	}
	if(n>sb.length())
		System.out.println("invalid");
	else
		System.out.println(sb.toString().substring(0,n));
}
}
