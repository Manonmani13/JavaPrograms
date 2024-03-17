package Array_23_10_2021;

public class Letter_Q {
	public static void main(String[] args) {
		for(int row=1;row<=7;row++)
		{ 
			for(int col=1;col<=6;col++)
			{
				
				 if(row==1&&col==1||row==1&&col==6||row==7&&col==1||row==7&&col==6)
					System.out.print(" ");
				 else if(row==1||col==1||row==7||col==6||row==4&&col==4||row==5&&col==5)
						System.out.print("*");
				else
				
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
 **** 
*    *
*    *
*  * *
*   **
*    *
 **** 



*/