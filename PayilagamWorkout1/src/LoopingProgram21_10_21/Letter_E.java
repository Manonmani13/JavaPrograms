package LoopingProgram21_10_21;

public class Letter_E {
	public static void main(String[] args) {
		for(int row=1;row<=7;row++)
		{ 
			if(row==1||row==7)
			{
			for(int col=1;col<=5;col++)
			{
				System.out.print("*");
			}
			}if(row==4)
			{
				for(int col=1;col<=5;col++)
				{
					System.out.print("*");
				}
			}
			System.out.println("*");
		}
	}
}
/*

******
*
*
******
*
*
******

*/
