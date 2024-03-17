package com.logic;

import java.util.Arrays;
import java.util.Scanner;

public class Algaram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	char a[]=s1.toLowerCase().toCharArray();
	char b[]=s2.toLowerCase().toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
	System.out.println(Arrays.equals(a, b));
	
}
}
