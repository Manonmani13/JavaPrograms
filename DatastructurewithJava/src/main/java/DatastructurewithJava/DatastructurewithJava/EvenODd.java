package DatastructurewithJava.DatastructurewithJava;

import java.util.Scanner;

public class EvenODd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a values");
		int  a=sc.nextInt();
		System.out.println(check(a));
	}
static String check(int a) {
	if(a%2==0)
		return "even";
	else
		return"odd";	
}
}
