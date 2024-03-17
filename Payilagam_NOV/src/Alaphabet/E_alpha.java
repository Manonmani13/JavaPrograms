package Alaphabet;

public class E_alpha {
	public static void main(String[] args) 
    {
        for(int row = 1; row<=9; row++)
        {
            if(row==1 || row == 9)
            {
                for(int col = 1; col<=9; col++)
                {
                    System.out.print("E ");
                }
            }
            else if(row==5)
            {
                for(int col = 1; col<=5; col++)
                {
                    System.out.print("E ");
                }
            }
            else 
            {
                for(int col = 1; col<=9; col++)
                {
                    if(col==1)
                    {
                    System.out.print("E ");
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
E E E E E E E E E 
E                 
E                 
E                 
E E E E E 
E                 
E                 
E                 
E E E E E E E E E 

*/