package Pattern_Pro;

public class Patt18 {
public static void main(String[] args) {
	 System.out.println();
     for (int i = 1; i <= 5; i++)
     {
         for (int j = 1; j <= i; j++)
         {
             System.out.print(j + " ");
         }
         for (int k = i - 1; k >= 1; k--)
         {
             System.out.print(k + " ");
         }
         System.out.println();
     }
     System.out.println();
     for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5 - i + 1; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
}
}
/*

1 
1 2 1 
1 2 3 2 1 
1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 

1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1 


*/