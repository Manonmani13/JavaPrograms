package Array_23_10_2021;

public class Letter_G {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=6;j++)
		{
			if(i==1||j==1||i==7) {
				System.out.print("*");
			}
			else if(i==4&&j==5||(j==6&&i==4)||(i==5&&j==6)||(i==6&&j==6))
				System.out.print("*");
			
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
/*
 * 
******
*     
*     
*   **
*    *
*    *
******
 */