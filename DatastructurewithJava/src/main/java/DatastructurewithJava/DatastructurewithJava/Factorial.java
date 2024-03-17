package DatastructurewithJava.DatastructurewithJava;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three values");
		int  n=sc.nextInt();
		System.out.println("Values"+fact1(n));
		System.out.println("Values"+fact2(n));


	}
	static int fact1(int n)
	{
		int i,f=1;
		for(i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	static int fact2(int n) {
		if(n==1)
			return 1;
		else
			return n*fact2(n-1);
		
	}
}
