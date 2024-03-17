package LoopingProgram21_10_21;

import java.util.Scanner;

public class Scanner_Float {
	public static void main(String[] args) {
		System.out.println("enter values");
		Scanner s=new Scanner(System.in);
		Float i=s.nextFloat();
		Float j=s.nextFloat();
		System.out.println(i%j);
	}
}
/*
enter values
10.2
15.4
10.2
*/