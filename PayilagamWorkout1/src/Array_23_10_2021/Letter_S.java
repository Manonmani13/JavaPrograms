package Array_23_10_2021;

public class Letter_S {
public static void main(String[] args) {
	for(int row=1;row<=7;row++)
	{ 
		
		for(int col=1;col<=6;col++)
		{
			if(col==1&&row==5||col==1&&row==6)
				System.out.print(" ");
			else if(row==1||row==7||col==1||row==4||row==5&&col==6||row==6&&col==6)
			{
			System.out.print("*");
		}
			else
				System.out.print(" ");
		}
		System.out.println();
		
			
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