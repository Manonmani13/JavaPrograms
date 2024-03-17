package LoopingProgram21_10_21;

public class Num_5 {
	public static void main(String[] args) {
		for(int row=1;row<=7;row++)
		{ 
			if(row==1||row==7)
			{
			for(int col=1;col<=6;col++)
			{
				System.out.print("*");
			}
			}
			else
			{
				for(int col=1;col<=6;col++)
				{
					if(col==1)
					System.out.print("*");
					else
						System.out.print(" ");
				}	
			}
			
			System.out.println();
		}
		for(int i=1;i<=7;i++)
		{
			if(i==7)
			{
				for(int col=1;col<=6;col++)
				{
					System.out.print("*");
				}
			}
			else {
				for(int col=1;col<=6;col++)
				{
					if(col==6)
			System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();	
			}
				
		}
	}
}
/*
******
*     
*     
*     
*     
*     
******
     *
     *
     *
     *
     *
     *
******






*/