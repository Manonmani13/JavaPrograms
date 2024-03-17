package Alaphabet;

public class Z0_pat {
	public static void main(String[] args) 
    {
        for(int row = 1; row<=9; row++)
        {
        if(row==1||row==9)
        {
            for(int col =1 ;col <=9; col++)
            {
                if(row == 1 && col==1 ||row == 1 && col==9 || row == 9 && col==1 ||row == 9 && col==9)
                {
                    System.out.print("  ");
                }
                else
                {
                System.out.print("O ");
                }
            }
        }
        else
        {
            System.out.print("O " + "  "+ "  "+ "  "+ "  "+ "  "+ "  "+ "  "+ "O ");
        }
        System.out.println();
        }       
    }
}
/*
  O O O O O O O   
O               O 
O               O 
O               O 
O               O 
O               O 
O               O 
O               O 
  O O O O O O O   

*/