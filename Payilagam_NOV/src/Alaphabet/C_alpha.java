package Alaphabet;

public class C_alpha {
	public static void main(String[] args) 
    {
        for(int row = 1; row<=9; row++)
        {
            if(row==1 || row == 9)
            {
                for(int col = 1; col<=9; col++)
                {
                    System.out.print("C ");
                }
            }
            else 
            {
                for(int col = 1; col<=9; col++)
                {
                    if(col==1)
                    {
                    System.out.print("C ");
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
C C C C C C C C C 
C                 
C                 
C                 
C                 
C                 
C                 
C                 
C C C C C C C C C 

*/