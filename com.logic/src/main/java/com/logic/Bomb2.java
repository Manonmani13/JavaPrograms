package com.logic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bomb2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine().toLowerCase();
	Pattern  p=Pattern.compile("bomb");
	Matcher m=p.matcher(s);
	if(m.find())
		System.out.println("DUCK");
	else
		System.out.println("Relax, there's no bomb");
}
}
