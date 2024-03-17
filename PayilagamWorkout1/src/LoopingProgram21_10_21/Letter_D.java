package LoopingProgram21_10_21;

public class Letter_D {
	public static void main(String[] args) {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=6;col++)
			{
				if(row==1||row==7)
				{
				
				if(col==6)
				{
				System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
				}
				else
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
***** 
*    *
*    *
*    *
*    *
*    *
***** 





*/