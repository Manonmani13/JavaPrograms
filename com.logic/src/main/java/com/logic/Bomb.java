package com.logic;

import java.util.Scanner;

public class Bomb {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine().toLowerCase();
	if(s.contains("bomb"))
		System.out.println("DUCK");
	else
		System.out.println("Relax, there's no bomb");
}
}
