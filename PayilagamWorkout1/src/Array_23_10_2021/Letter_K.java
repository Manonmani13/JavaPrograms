package Array_23_10_2021;

public class Letter_K {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=6;j++)
		{
			if(j==1)
			System.out.print("*");
			else if(i==1&&j==6||i==2&&j==5||i==3&&j==4||i==7&&j==6||i==6&&j==5||i==5&&j==4||i==4&&j==2)
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
*   * 
*  *  
**    
*  *  
*   * 
*    *

*/