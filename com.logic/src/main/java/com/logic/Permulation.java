package com.logic;

import java.util.Scanner;

public class Permulation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	permulation(s, 0, s.length()-1);
}
static void permulation(String s,int left,int right) {
	if(left==right)
		System.out.println(s);
	else {
		for(int i=left;i<=right;i++) {
			s=swap(s,left,i);
			permulation(s,left+1,right);
			s=swap(s,left,i);
		}
	}
}
static String swap(String a,int i,int j) {
	char temp;
	char[] charArray=a.toCharArray();
	temp=charArray[i];
	charArray[i]=charArray[j];
	charArray[j]=temp;
	return String.valueOf(charArray);
}
}
