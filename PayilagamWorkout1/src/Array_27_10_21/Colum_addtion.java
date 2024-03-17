package Array_27_10_21;

import java.util.Scanner;

public class Colum_addtion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows no");
		int r=sc.nextInt();
		System.out.println("Enter cols no");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
	    
		for(int i=0;i<a.length;i++)
		{ 
			
			for(int j=0;j<a[i].length;j++)
			{
				
				a[i][j]=sc.nextInt();
				
				
			}
		}
		for(int i=0;i<a.length;i++)
		{ 
			int tot=0;	
			for(int j=0;j<a[i].length;j++)
			{
					tot=tot+a[j][i];
					
			}
			System.out.println(tot);
			
		}
	
}
}
/*
Enter rows no
3
Enter cols no
3
1 2 3
4 5 2
3 5 2
8
12
7
*/