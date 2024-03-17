package Alaphabet;

public class H_alpha {
	public static void main(String[] args) 
    {
        for(int row = 1; row<=9; row++)
        {
            if(row==5)
            {
                for(int col = 1; col<=9; col++)
                {
                    System.out.print("H ");
                }
            }
            else 
            {
                for(int col = 1; col<=9; col++)
                {
                    if(col==1 || col==9)
                    {
                    System.out.print("H ");
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
H               H 
H               H 
H               H 
H               H 
H H H H H H H H H 
H               H 
H               H 
H               H 
H               H 


*/