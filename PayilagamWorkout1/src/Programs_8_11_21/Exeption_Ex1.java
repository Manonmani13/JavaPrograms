package Programs_8_11_21;

import java.util.Scanner;

public class Exeption_Ex1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int no=sc.nextInt();
	System.out.println("Enter number 2");
	int no1=sc.nextInt();
	System.out.println(no/no1);
}
}
/*
Enter number
22
Enter number 2
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Programs_8_11_21.Exeption_Ex1.main(Exeption_Ex1.java:12)

*/