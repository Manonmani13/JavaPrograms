package Array_Exam_26_10_21;

import java.util.Scanner;

public class Two_Dimenional_Scanner {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter rows");
	int r=s.nextInt();
	System.out.println("Enter columns");
	int c=s.nextInt();
	int mark[][]=new int[r][c];
	for(int i=0;i<mark.length;i++)
	{
		int total=0;
		for(int j=0;j<mark[i].length;j++)
		{
			mark[i][j]=s.nextInt();
			total=total+mark[i][j];
			
		}
		System.out.println("Total is "+total);
	}
}
}
/*
Enter rows
2
Enter columns
2
34 55 43 32
Total is 89
Total is 75
*/