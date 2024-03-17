package DatastructurewithJava.DatastructurewithJava;

import java.util.Scanner;

public class PrimeNo {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a values");
	int  n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.println(i+"\t "+(isPrime1(i)?"Yes":"No"));
		System.out.println(i+"\t "+(isPrime2(i,i/2)?"Yes":"No"));

	}
}
static  boolean isPrime1(int n) {
	int i,f=0;
	for(i=1;i<=n;i++) {
		if(n%i==0)
			f++;
	}
	return f==2;
}
static boolean isPrime2(int n,int i) {
	if(i==1)
		return true;
	else if(n%i==0)
		return false;
	else
		return isPrime2(n,--i);
}
}
