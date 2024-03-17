package DatastructurewithJava.DatastructurewithJava;

import java.util.Scanner;

public class SumOfValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a values");
		int  a=sc.nextInt();
		System.out.println(sumofversion(a));
		System.out.println(sumv2(a));
		System.out.println(sumv3(a));
	}
	static int sumofversion(int n) {
		int sum=0;
		
			for(int i=1;i<=n;i++) {
				sum=sum+i;
			}
			return sum;
	}
	static int sumv2(int n) {
		if(n==0)
			return 0;
		else
			return n+sumv2(n-1);
	}
	static int sumv3(int n) {
	return (n*(n+1))/2;
	}
}
