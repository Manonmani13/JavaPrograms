package com.logic;

import java.util.Scanner;

public class ChessColor {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	if(((s.charAt(0)-'a')+1)%2!=s.charAt(1)%2) {
		System.out.println("true");
	}
	else
		System.out.println("false");
}
}
