package com.logic;

import java.util.Scanner;

public class JewellStone {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(JandS(sc.nextLine(),sc.nextLine()));
}

private static int JandS(String s1, String s2) {
	int c=0;
	for(int i=0;i<s1.length();i++) {
		for(int j=0;j<s2.length();j++) {
			if(s1.charAt(i)==s2.charAt(j)) {
				c++;
			}
		}
	}
	return c;
	
}
}
