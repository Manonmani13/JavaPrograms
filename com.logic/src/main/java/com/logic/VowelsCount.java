package com.logic;

import java.util.Scanner;

public class VowelsCount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int i=0,v=0;
	for(i=0;i<s.length();i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
				s.charAt(i)=='o'||s.charAt(i)=='u') {
			v++;
		}
	}
	System.out.println(v);
}
}
