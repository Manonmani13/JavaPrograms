package Array_27_10_21;

import java.util.Scanner;

public class TransPose_Array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rows no");
	int r=sc.nextInt();
	System.out.println("Enter cols no");
	int c=sc.nextInt();
	int a[][]=new int[r][c];
    int b[][]=new int[r][c];
	for(int i=0;i<a.length;i++)
	{ 
		
		for(int j=0;j<a[i].length;j++)
		{
			
			a[i][j]=sc.nextInt();
			
			
		}
	}
	for(int i=0;i<a.length;i++)
	{ 
		
		for(int j=0;j<a[i].length;j++)
		{
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+" ");
		}
		;
		System.out.println();
	}
	
}
}
/*
Enter rows no
2
Enter cols no
2
1 2 
3 4
1 3 
2 4 
*/