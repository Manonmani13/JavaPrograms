package Pattern_Pro;

public class Patt19 {
public static void main(String[] args) {
	System.out.println();
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 5; j > i; j--)
        {
            System.out.print(" ");
        }

        for (int k = 1; k <= i; k++)
        {
            System.out.print(k + " ");
        }
        System.out.println();
    }
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            System.out.print(" ");
        }
        for (int k = 1; k <= 5 - i; k++)
        {
            System.out.print(k + " ");
        }
        System.out.println();
    }	
}
}
/*

    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1 
     

*/