package Practice_24_10_21;

import java.util.Scanner;

public class Strong_num3 {
	public static void main(String[] args) 
	{
		int Number, Temp, Reminder, Sum = 0, i, Factorial;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		Number = sc.nextInt();		
		
		Temp = Number;
		while( Temp > 0)
		{
			Factorial = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }
		    System.out.println(" The Factorial of " + Reminder + "  =  " + Factorial);
		     Sum = Sum + Factorial;
		     Temp = Temp /10;
		}
		
		System.out.println(" The Sum of the Factorials of a Given Number " + Number + " =  " + Sum);
		
		if ( Number == Sum )
		{
			System.out.println("\n " + Number + " is a Strong Number");
		}
		else
		{
		   System.out.println("\n " + Number + " is Not a Strong Number");
		}
	}
}
/*
 Please Enter any Number : 124
 The Factorial of 4  =  24
 The Factorial of 2  =  2
 The Factorial of 1  =  1
 The Sum of the Factorials of a Given Number 124 =  27

 124 is Not a Strong Number

*/