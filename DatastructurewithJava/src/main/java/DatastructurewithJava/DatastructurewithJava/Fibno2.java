package DatastructurewithJava.DatastructurewithJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibno2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a values");
		int n=sc.nextInt();
		System.out.println("The Fibnoacci "+getFibno(n));
		
	}
	private static ArrayList<Integer> getFibno(int n) {
		// TODO Auto-generated method stub
		int a,b,c,i;
		ArrayList<Integer> al=new ArrayList<Integer>();
		a=0;
		b=1;
		al.add(a);
		al.add(b);
		for(i=1;i<=n-2;i++) {
			c=a+b;
			al.add(c);
			a=b;
			b=c;
		}
		return al;
	}
}
