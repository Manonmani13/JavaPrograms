package Game_3_11_21;

import java.util.Scanner;

public class Game_Att7 {
	public static void main(String[] args) {
		boolean flag=true;
		System.out.println("Enter the number 1 to 9 for user 1");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int number[]=new int[num];
		System.out.println("Enter the number 1 to 9 user 2");
		int num1=sc.nextInt();
		int number1[]=new int[num];
		char ch[]=new char[number.length]; 
		int p[]=new int[ch.length];
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
						flag=true;
					}
					else if(number[i]==number1[j]&&i!=j)
					{
						
						ch[j]='P';
					
						flag=true;
						 number1[i] = number[j];
						//ch[j]='C'
					}
					else
					{
						if(ch[j]!='P'&&ch[j]!='C')
							ch[j]='X';
						flag=false;
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
					System.out.print(number1[j]+" "+ ch[j]+" ");
				}
				else if(number[i]==number1[j]&&i!=j)
				{
					System.out.print(number1[j]+" "+ch[j]+" ");
					
					
				}
				/*else
				{
					if(ch[j]!='C'&&ch[j]!='P')
					{
						System.out.println(number1[j]+" "+ch[j]+" ");
						
					}
				}*/
		
				}
			}
			
		}//num and num1 is not equal then it will print
		else
		{
			System.out.println("invalid number size");
		}
		int loc = 0;
		for (int a=0; a<ch.length; a++) {
			if(ch[a] == 'X') {
				loc =a;
			}
		}
		System.out.println("Loc"+ loc);
		
		
	}
}
