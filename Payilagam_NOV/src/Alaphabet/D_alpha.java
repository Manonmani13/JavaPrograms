package Alaphabet;

public class D_alpha {
	public static void main(String[] args) 
    {
        for(int row = 1; row<=9; row++)
        {
            if(row==1 || row == 9)
            {
                for(int col = 1; col<=9; col++)
                {
                    System.out.print("D ");
                }
            }
            else 
            {
                for(int col = 1; col<=9; col++)
                {
                    if(col==2 || col==9)
                    {
                    System.out.print("D ");
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
D D D D D D D D D 
  D             D 
  D             D 
  D             D 
  D             D 
  D             D 
  D             D 
  D             D 
D D D D D D D D D 

*/