package Array_23_10_2021;

public class Letter_N {
public static void main(String[] args) {
	for(int i=1;i<=6;i++)
	{
		for(int j=1;j<=6;j++)
		{
			if(j==1||j==6||i==2&&j==2||i==3&&j==3||i==4&&j==4||i==5&&j==5)
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
**   *
* *  *
*  * *
*   **
*    *

*/