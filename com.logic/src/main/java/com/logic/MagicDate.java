package com.logic;

import java.util.Scanner;

public class MagicDate {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int d=sc.nextInt();
	int m=sc.nextInt();
	int y=sc.nextInt();
	String s1=Integer.toString(d*m);
	String s2=Integer.toString(y);
	System.out.println(s2.endsWith(s1));

}
}
