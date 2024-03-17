package Array_27_10_21;

import java.util.Scanner;

public class Cross_array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rows no");
	int r=sc.nextInt();//2
	System.out.println("Enter rows no");
	int c=sc.nextInt();//2
	int a[][]=new int[r][c];//2 2 
int tot=0;//0
	for(int i=0;i<a.length;i++)//0<2  1<2 2<2
	{
		
		for(int j=0;j<a[i].length;j++)//0<2  1<2  2<2
		{
			a[i][j]=sc.nextInt();// 1 2 3 4
		}
	}
	
		for(int i=0;i<a.length;i++)//0<2   1<2
		{ 
			
			for(int j=0;j<a[i].length;j++) //0<2 1<2 2<2
			{

				if(a[i]==a[j])
				{
					tot=tot+a[i][j];//1+4=5
					
				}
				
				
			}
			
		}
	
		System.out.println(tot);
}
}
/*
 * Enter rows no
2
Enter rows no
2
3 2
2 4
7
 */

