package LoopingProgram21_10_21;

import java.util.Scanner;

public class Scanner_Byte {
	public static void main(String[] args) {
		System.out.println("enter values");
		Scanner s=new Scanner(System.in);
		byte i=s.nextByte();
		byte j=s.nextByte();
		System.out.println(i*j);
	}
}
/*
enter values

3
6
18


*/