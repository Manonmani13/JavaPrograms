package com.logic;

public class APattern {
public static void main(String[] args) {
	for(int i=5;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("  ");
		}
		for(int j=i;j<=5;j++) {
			if(i==j|| j==5||i==3)
			System.out.print(" * ");
			else
				System.out.print("   ");
		}
		System.out.println();
	}
}
}
