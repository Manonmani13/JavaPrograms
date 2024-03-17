package Array_27_10_21;

import java.util.Scanner;

public class Jagged_Array_Ex {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int ar[][]=new int[2][];
	System.out.println(ar.length);
	System.out.println(ar[0].length);
	/*for(int i=1;i<ar.length;i++)
	{
		for(int j=1;j<ar[i].length;j++)
		{
			ar[i][j]=sc.nextInt();
		}
	}
	for(int i=1;i<ar.length;i++)
	{
		for(int j=1;j<ar[i].length;j++)
		{
			System.out.print(ar[i][j]); 
		}
	}*/
	
}
}
/*
 * 2
Exception in thread "main" java.lang.NullPointerException
	at Array_27_10_21.Jagged_Array_Ex.main(Jagged_Array_Ex.java:11)

 
int ar[][]=new int[2][];
you will get error for this null pointer exception
*/