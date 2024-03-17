package Alaphabet;

public class I_alpha {
	public static void main(String[] args) 
    {
        for(int row = 1; row<=9; row++)
        {
            if(row==1 || row==9)
            {
                for(int col = 1; col<=9; col++)
                {
                    System.out.print("I ");
                }
            }
            else 
            {
                for(int col = 1; col<=9; col++)
                {
                    if(col==5)
                    {
                    System.out.print("I ");
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
I I I I I I I I I 
        I         
        I         
        I         
        I         
        I         
        I         
        I         
I I I I I I I I I 

*/