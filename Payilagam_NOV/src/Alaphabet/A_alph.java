package Alaphabet;

public class A_alph {
	public static void main(String[] args) 
    {
        for(int row = 1; row<=9; row++)
        {
        for (int col = 1; col <= 9; col++) 
        {
            if (row==1 || row==5)
            {
            System.out.print("A ");
            }
            else if (col==1 || col==9)
            {
            System.out.print("A ");
            }
            else
            {
            System.out.print("  ");
            }               
        }
        System.out.println();
        }
    }
}
/*
A A A A A A A A A 
A               A 
A               A 
A               A 
A A A A A A A A A 
A               A 
A               A 
A               A 
A               A 


*/