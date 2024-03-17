package com.logic;

import java.util.Scanner;

public class LoopTest1 {
public static void main(String[] args) {
	int x,y;
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	y=sc.nextInt();
	for(int i=1;i<=x;i++) {
		for(int j=1;j<=y;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
