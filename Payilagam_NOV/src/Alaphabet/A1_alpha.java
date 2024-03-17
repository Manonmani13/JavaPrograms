package Alaphabet;

public class A1_alpha {
	public static void main(String[] args) 
    {
        for(int row = 1; row<=9; row++)
        {
        if(row==1||row==5)
        {
            for(int col =1 ;col <=9; col++)
            {
                if(row == 1 && col==1 || row == 1 && col==9)
                {
                    System.out.print("  ");
                }
                else
                {
                System.out.print("A ");
                }
            }
        }
        else
        {
            System.out.print("A " + "  "+ "  "+ "  "+ "  "+ "  "+ "  "+ "  "+ "A ");
        }
        System.out.println();
        }       
    }
}
/*
  A A A A A A A   
A               A 
A               A 
A               A 
A A A A A A A A A 
A               A 
A               A 
A               A 
A               A 

*/