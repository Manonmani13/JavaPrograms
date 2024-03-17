package Alaphabet;

public class B_alpha {

    public static void main(String[] args) 
    {
        for(int row = 1; row<=9; row++)
        {
        if(row==1||row==5||row==9)
        {
            for(int col =1 ;col <=9; col++)
            {
                if(row == 1 && col==9 || row == 9 && col==9)
                {
                    System.out.print("  ");
                }
                else
                {
                System.out.print("B ");
                }
            }
        }
        else
        {
            System.out.print("B " + "  "+ "  "+ "  "+ "  "+ "  "+ "  "+ "  "+ "B ");
        }
        System.out.println();
        }       
    }
}
/*
B B B B B B B B   
B               B 
B               B 
B               B 
B B B B B B B B B 
B               B 
B               B 
B               B 
B B B B B B B B   

*/