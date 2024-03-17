package com.logic;

import java.util.Scanner;

public class TestEven {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=0) {
			if(n%2==0)
				System.out.println("Even number");
			else
				System.out.println("Odd Number");
	}
		else
		{
			System.out.println("invalid Number ");
		}
	}
}
