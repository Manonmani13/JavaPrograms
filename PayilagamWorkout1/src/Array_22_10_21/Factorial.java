package Array_22_10_21;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	int n,fact=1;
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial of"+n+"is"+fact);
}
}
/*

Enter the number
5
Factorial of5is120
*/