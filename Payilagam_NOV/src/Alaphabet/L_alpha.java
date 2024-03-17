package Alaphabet;

public class L_alpha {
	public static void main(String[] args) 
    {
        for(int row = 1; row<=9; row++)
        {
            if(row==9)
            {
                for(int col = 1; col<=9; col++)
                {
                    System.out.print("L ");
                }
            }
            else 
            {
                for(int col = 1; col<=9; col++)
                {
                    if(col==1)
                    {
                    System.out.print("L ");
                    }
                    else
                    {
                    System.out.print("  "); 
                    }
                }                   
                }           
        System.out.println();
        }       
    }
}
/*
L                 
L                 
L                 
L                 
L                 
L                 
L                 
L                 
L L L L L L L L L 

*/