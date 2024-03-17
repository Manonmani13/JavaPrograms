package Alaphabet;

public class U_alpha {
	public static void main(String[] args) 
    {
        for(int row = 1; row<=9; row++)
        {
            if(row==9)
            {
                for(int col = 1; col<=9; col++)
                {
                    System.out.print("U ");
                }
            }
            else 
            {
                for(int col = 1; col<=9; col++)
                {
                    if(col==1 || col==9)
                    {
                    System.out.print("U ");
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
U               U 
U               U 
U               U 
U               U 
U               U 
U               U 
U               U 
U               U 
U U U U U U U U U 

*/