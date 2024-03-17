package Alaphabet;

public class Y_alpha {
	 public static void main(String[] args) 
	    {
	        for(int row = 1; row<=9; row++)
	        {
	            if(row==9)
	            {
	                for(int col = 1; col<=9; col++)
	                {
	                    if(col==9)
	                    {
	                    System.out.print("  ");
	                    }
	                    else
	                    {
	                    System.out.print("Y "); 
	                    }
	                }
	            }
	            else if(row==5)
	            {
	                for(int col = 1; col<=9; col++)
	                {
	                    if(col==1|| row == 5 && col == 9)
	                    {
	                    System.out.print("  "); 
	                    }
	                    else
	                    {
	                    System.out.print("Y ");
	                    }
	                }
	            }
	            else if(row==1 || row==2 || row==3 || row==4)
	            {
	                for(int col = 1; col<=9; col++)
	                {
	                    if(col==1 || col==9)
	                    {
	                    System.out.print("Y ");
	                    }
	                    else
	                    {
	                    System.out.print("  "); 
	                    }
	                }                   
	            }
	            else if(row==6 || row==7 || row==8)
	            {
	                for(int col = 1; col<=9; col++)
	                {
	                    if(col==9)
	                    {
	                    System.out.print("Y ");
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
Y               Y 
Y               Y 
Y               Y 
Y               Y 
  Y Y Y Y Y Y Y   
                Y 
                Y 
                Y 
Y Y Y Y Y Y Y Y   

*/