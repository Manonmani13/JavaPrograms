package com.logic;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++)
			{
				System.out.print(" "+k+" ");
				k+=2;
			}
			System.out.println();
		}
	}
}
