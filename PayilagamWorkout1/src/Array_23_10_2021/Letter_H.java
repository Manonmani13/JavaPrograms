package Array_23_10_2021;

public class Letter_H {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=6;j++)
		{
			if(j==1||j==6||i==4)
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
*    *
*    *
******
*    *
*    *
*    *
*/