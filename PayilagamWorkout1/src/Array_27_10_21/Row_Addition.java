package Array_27_10_21;

import java.util.Scanner;

public class Row_Addition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows no");
		int r=sc.nextInt();
		System.out.println("Enter cols no");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
	    int tot=0;
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
					tot=tot+a[i][j];
					
			}
			System.out.println(tot);
			
		}
	
}
}
/*
nter rows no
2
Enter rows no
2
1 4
3 2
5
10
*/