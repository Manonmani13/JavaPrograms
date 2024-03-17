package LoopingProgram21_10_21;

public class Num_8 {
	public static void main(String[] args) {
	Num_8 n=new Num_8();
	for(int i=1;i<=2;i++)
	{
		n.print();
	}
		
	
	}
	void print()
	{
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
					if(col==1||col==6)
					System.out.print("*");
					else
						System.out.print(" ");
				}	
			}
			
			System.out.println();
		}
	
	}
	}
/*
output
******
*    *
*    *
*    *
*    *
*    *
******
******
*    *
*    *
*    *
*    *
*    *
******






*/