package com.logic;

import java.util.Scanner;

public class FirstVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||
					s.charAt(i)=='i'||
					s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				System.out.println(i);
				break;
				
			}
				
		}
				
	}

}
