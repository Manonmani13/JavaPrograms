package Game_3_11_21;

import java.util.Scanner;

public class Game_Att4 {
	public static void main(String[] args) {
		System.out.println("Enter the number 1 to 9 for user 1");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int number[]=new int[num];
		System.out.println("Enter the number 1 to 9 user 2");
		int num1=sc.nextInt();
		int number1[]=new int[num];
		if(num==num1)
		{
			System.out.println("Enter any values for user 1 ");
			for( int i=0;i<number.length;i++)
			{
				number[i]=sc.nextInt();
				
			}
			System.out.println("Enter any values for user 2 ");
			for( int i=0;i<number1.length;i++)
			{
				number1[i]=sc.nextInt();
				
			}
			for(int i=0;i<number.length;i++)
			{
				for(int j=0;j<number.length;j++)
				{
					System.out.print(number[j]+"  ");
				}
				for(int j=0;j<number1.length;j++)
				{
					for(int k=0;k<number1.length;k++)
					{
						System.out.print(number1[k]+"  ");
					}
					if(number[i]==number1[j]&&i==j)
					{
						System.out.print(number[j]+" C "+" ");
					}
					else if(number[i]==number1[j]&&i!=j)
					{
						System.out.print(number[i]+" P "+" ");
					}
				}
			}
			
			
			
		}
		else
		{
			System.out.println("invalid number size");
		}
		
		
		
		
	}
}
