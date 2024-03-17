package com.logic;

import java.util.Scanner;

public class Time {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s[]=sc.nextLine().split(":");
	for(String t:s)
		System.out.println(t);
}
}
