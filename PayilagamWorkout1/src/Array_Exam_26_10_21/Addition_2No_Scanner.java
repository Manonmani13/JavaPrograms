package Array_Exam_26_10_21;

import java.util.Scanner;

public class Addition_2No_Scanner {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Rows");
	int row=s.nextInt();
	System.out.println("Enter the Columns");
	int col=s.nextInt();
	int a[][]=new int[row][col];
	int b[][]=new int[row][col];
	int c[][]=new int[row][col];
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c[i].length;j++)
		{
			a[i][j]=s.nextInt();
			
		}
	}
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c[i].length;j++)
		{
			b[i][j]=s.nextInt();
			
		}
	}
	System.out.println("REsult is");
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c[i].length;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}
/*
 Enter the Rows
2
Enter the Columns
2
1 2 3 4 
1 3 2 4
REsult is
2 5 
5 8
 */
