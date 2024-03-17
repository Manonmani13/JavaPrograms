package Alaphabet;

public class Y1_alp {
	public static void main(String[] args) 
    {
        for(int row = 9; row>=1; row--)
        {
            for(int col = 1; col<= row; col++)
            {
                if (col == row || col == 10-row)
                {
                    System.out.print("Y "); 
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
Y               Y 
  Y           Y 
    Y       Y 
      Y   Y 
        Y 
      Y 
    Y 
  Y 
Y 


*/