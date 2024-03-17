package com.logic;

import java.util.Scanner;

public class TimeSplit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s[]=sc.nextLine().split(":");
	int n1,n2;
	if(s[0].charAt(0)=='0')
		n1=Integer.valueOf(s[0].charAt(1)-48);
	else
		n1=Integer.valueOf(s[0].charAt(0)-48)*10+Integer.valueOf(s[0].charAt(1)-48);
	if(s[1].charAt(0)=='0')
		n2=Integer.valueOf(s[1].charAt(1)-48);
	else
		n2=Integer.valueOf(s[0].charAt(0)-48)*10+Integer.valueOf(s[0].charAt(1)-48);
	System.out.println(n1*60+n2);

}
}
