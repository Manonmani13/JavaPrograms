package DatastructurewithJava.DatastructurewithJava;

import java.util.Scanner;

public class SwapLogic1 {
void swap(int a,int b) {
	System.out.println("before swapping 	a="+a+" b="+b);
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("after swapping two a= "+a+" b="+b);
}

public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two values");
	int  a=sc.nextInt();
	int b=sc.nextInt();
	SwapLogic1 s=new SwapLogic1();
	s.swap(a, b);
}
}
