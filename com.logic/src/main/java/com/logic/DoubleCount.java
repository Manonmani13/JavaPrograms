package com.logic;

import java.util.Scanner;

public class DoubleCount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int a=0,b=0,c=0,i;
	for(i=0;i<s.length();i++) {
		if(s.charAt(i)=='A')a++;
		if(s.charAt(i)=='B')b++;
		if(s.charAt(i)=='C')c++;
	}
	System.out.println(a+ " "+b+" "+c);			
			
}
}
