package Game_3_11_21;

import java.util.Scanner;

public class Game_Att11 {
	public static void main(String[] args) {
		
		System.out.println("Enter the number 1 to 9 for user 1");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int number[]=new int[num];
		System.out.println("Enter the number 1 to 9 user 2");
		int num1=sc.nextInt();
		int n=0,n1=0;
		int number1[]=new int[num];
		char ch[]=new char[number.length]; 
		
		//if num and num1 equal then only it run
		if(num==num1)
		{
			//get input from user 1
			System.out.println("Enter any values for user 1 ");
			for( int i=0;i<number.length;i++)
			{
				number[i]=sc.nextInt();
				
			}
			//get input from user2
			System.out.println("Enter any values for user 2 ");
			for( int i=0;i<number1.length;i++)
			{
				number1[i]=sc.nextInt();
				
			}
			//assign here C P X
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
						n=j;
						
					}
					else
					{
						if(ch[j]!='P'&&ch[j]!='C')
						{
							ch[j]='X';
							n1=j;
						}
					}
				
					}
			}
		//print C P X
			for(int i=0;i<number.length;i++)
			{
				for(int j=0;j<number1.length;j++)
				{
				if(number[i]==number1[j]&&i==j)
				{
					System.out.println(number1[j]+" "+ ch[j]+" ");
				}
				else if(number[i]==number1[j]&&i!=j)
				{
					System.out.println(number1[j]+" "+ch[j]+" ");	
				}
				else
				{
					if(ch[j]!='C'&&ch[j]!='P')
					{
						System.out.println(number1[j]+" "+ch[j]+" ");
						
					}
				}
		
				}
			}
			
			for(char c=0;c<ch.length;c++)
			{
				//System.out.println(ch[c]);
				if(ch[c]=='P')
				{
					for(int i=0;i<number.length;i++)
					{
						for(int j=0;j<number1.length;j++)
						{
							if(ch[c]=='P'&&i<=n||ch[c]=='P'&&i>n)
							{
								number1[i]=number[j];
								if(i==j&&number[i]==number1[j])
								ch[j]='C';
							}
							System.out.print(number1[j]+" "+ch[j]+"");
						}
					}
				}
				if(ch[c]=='X')
				{
					for(int i=0;i<number.length;i++)
					{
						for(int j=0;j<number1.length;j++)
						{
							if(ch[j]=='X'&&number[i]!=number1[j])
							{
								//System.out.println("enter a number");
								n=sc.nextInt();
							    number1[j]=n;
							}
							if(number[i]==n&&i==j)
							{
							
								ch[j]='C';
								System.out.println(number1[j]+" "+ch[j]);
							}
//							else	
//							{
//								ch[j]='X';
//								System.out.println(number1[j]+" "+ch[j]);}
						}
					}
				}
			}
			
		}//num and num1 is not equal then it will print
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
1 3 5
Enter any values for user 2 
3 1 4
1 P 
4 X 
3 P 
4 X 
4 X 
1 C1 P4 X1 C1 P4 X1 C1 P4 X1 C1 P4 X5 C3 C4 X5 C3 C4 X
5
5
5 C
*/