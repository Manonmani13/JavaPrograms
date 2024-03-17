package DatastructurewithJava.DatastructurewithJava;

import java.util.Scanner;
public class MaxNo {
	int max_version(int a,int b) {
		return (a>b)?a:b;
	}
	double max(int a,int b) {
		return Math.max(a, b);
	}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two values");
	int  a=sc.nextInt();
	int b=sc.nextInt();
	MaxNo s=new MaxNo();
	System.out.println(s.max_version(a, b));;
	System.out.println(s.max(a, b));;

}
}
