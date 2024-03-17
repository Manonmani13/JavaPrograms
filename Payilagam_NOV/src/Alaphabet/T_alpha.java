package Alaphabet;

public class T_alpha {
	 public static void main(String[] args) 
	    {
	        for(int row = 1; row<=9; row++)
	        {
	            if(row==1)
	            {
	                for(int col = 1; col<=9; col++)
	                {
	                    System.out.print("T ");
	                }
	            }
	            else 
	            {
	                for(int col = 1; col<=9; col++)
	                {
	                    if(col==5)
	                    {
	                    System.out.print("T ");
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
T T T T T T T T T 
        T         
        T         
        T         
        T         
        T         
        T         
        T         
        T         

*/