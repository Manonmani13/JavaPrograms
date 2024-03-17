package DatastructurewithJava.DatastructurewithJava;

import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three values");
		int  a=sc.nextInt();
		int  b=sc.nextInt();
		int  c=sc.nextInt();
System.out.println(max1(a,b,c));
System.out.println(max2(a,b,c));
	}
	static int max1(int a,int b,int c) {
		return (a>b&&a>c)?a:((b>c)?b:c);
	}
	static int max2(int a,int b,int c) {
		return Math.max(Math.max(a, b),c);
	}
}
