package Programs_8_11_21;

import java.util.Scanner;

public class Exception_Ex2 {

void divi() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int no=sc.nextInt();
	System.out.println("Enter number 2");
	int no1=sc.nextInt();
	System.out.println(no/no1);
}
	public static void main(String[] args) {
		Exception_Ex2 s=new Exception_Ex2();
		s.divi();
	}
}
/*
 Enter number
32
Enter number 2
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Programs_8_11_21.Exception_Ex2.divi(Exception_Ex2.java:13)
	at Programs_8_11_21.Exception_Ex2.main(Exception_Ex2.java:17) //this is stack trace
 */
