package com.logic;

import java.util.Scanner;

public class NextPrime {
static boolean isPrime(int n)
{
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			return false;
			
		}
	}
	return true;
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	for(int i=sc.nextInt();;i++) {
		if(isPrime(i)) {
			System.out.println(i);
			break;
		}
	}
}
}
