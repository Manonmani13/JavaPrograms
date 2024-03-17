package LoopingProgram21_10_21;

public class Letter_M {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=7;j++)
		{
			if(j==1||j==7||i==3&&j==4||i==2&&j==3||i==2&&j==5)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
/*
*     *
* * * *
*  *  *
*     *
*     *
*     *
*     *

*/