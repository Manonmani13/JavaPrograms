package com.logic;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LongestWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	StringTokenizer st=new  StringTokenizer(s);
	int m=0;
	String t=new String();
	String resut=new String();
	while(st.hasMoreTokens())
	{
		t=st.nextToken();
		if(t.length()>m) {
			m=t.length();
			resut=t;
		}
	}
	System.out.println(resut);
}
}
