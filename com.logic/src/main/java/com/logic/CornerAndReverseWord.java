package com.logic;

import java.util.Scanner;

public class CornerAndReverseWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String[] s=sc.nextLine().split(",");
	StringBuffer sb=new StringBuffer();
	for(int i=1;i<s.length-1;i++) {
		sb.append(s[i]);
		sb.append(" ");
	}
	System.out.println(s[s.length-1]);
	System.out.println(sb.reverse());
	System.out.println(" "+s[0]);
}
}
