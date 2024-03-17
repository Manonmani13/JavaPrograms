package Array_23_10_2021;

public class Letter_Y {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=6;j++)
		{
			if(j==1&&i==1||j==6&&i==1||i==2&&j==2||i==2&&j==5||i==3&&j==3||i==3&&j==4||i==4&&j==3||i==5&&j==2)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
/*
*    *
 *  * 
  **  
  *   
 *

*/