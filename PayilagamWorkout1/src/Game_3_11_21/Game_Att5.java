package Game_3_11_21;

import java.util.Scanner;

public class Game_Att5 {

		public static void main(String[] args) {
			System.out.println("Enter the number 1 to 9 for user 1");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int number[]=new int[num];
			System.out.println("Enter the number 1 to 9 user 2");
			int num1=sc.nextInt();
			int number1[]=new int[num];
			char ch[]=new char[number.length]; 
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
				for(int i=0;i<number.length;i++)//0<2 1<2
				{
					for(int j=0;j<number1.length;j++)//0<2 1<2
					{
						if(number[i]==number1[j]&&i==j)//1==1 0==0 1==2 0==1
						{
							ch[j]='C';
						}
						else if(number[i]==number1[j]&&i!=j)
						{
							ch[j]='P';
						}
						else
						{
							if(ch[j]!='P'&&ch[j]!='C')
								ch[j]='X';
						}
					}
				}
			
				for(int i=0;i<number.length;i++)
				{
					for(int j=0;j<number1.length;j++)
					{
					if(number[i]==number1[j]&&i==j)
					{
						System.out.print(number1[j]+" "+ ch[j]+" ");
					}
					else if(number[i]==number1[j]&&i!=j)
					{
						System.out.print(number1[j]+" "+ch[j]+" ");
					}
					else
					{
						if(ch[j]!='C'&&ch[j]!='P')
						{
							System.out.println(number1[j]+" "+ch[j]+" ");
							break;
						}
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

/*
Enter the number 1 to 9 for user 1
3
Enter the number 1 to 9 user 2
3
Enter any values for user 1 
1 5 6
Enter any values for user 2 
1 6 4
1 C 4 X 
4 X 
6 P 4 X 
*/