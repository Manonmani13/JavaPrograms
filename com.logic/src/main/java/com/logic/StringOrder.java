package com.logic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringOrder {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char[] c=s.toCharArray();
	Arrays.sort(c);
	System.out.println(new String(c).equals(s));
	
}
}
