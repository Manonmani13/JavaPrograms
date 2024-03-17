package Alaphabet;

public class J_alpha {
	public static void main(String[] args) 
    {
        for(int row = 1; row<=9; row++)
        {
            if(row==1)
            {
                for(int col = 1; col<=9; col++)
                {
                    System.out.print("J ");
                }
            }
            else if(row==9)
            {
                for(int col = 1; col<=5; col++)
                {
                    System.out.print("J ");
                }
            }
            else if(row==5 || row==6 || row==7 || row==8 || row==9)
            {
                for(int col = 1; col<=9; col++)
                {
                    if(col==1 || col==5)
                    {
                    System.out.print("J ");
                    }
                    else
                    {
                    System.out.print("  "); 
                    }
                }                   
            }
            else 
            {
                for(int col = 1; col<=9; col++)
                {
                    if(col==5)
                    {
                    System.out.print("J ");
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
J J J J J J J J J 
        J         
        J         
        J         
J       J         
J       J         
J       J         
J       J         
J J J J J 

*/