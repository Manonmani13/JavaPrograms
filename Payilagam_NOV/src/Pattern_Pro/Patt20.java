package Pattern_Pro;

public class Patt20 {
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
             System.out.print(k);
         }
         for (int l = i - 1; l >= 1; l--)
         {
             System.out.print(l);
         }
         System.out.println();
     }
     System.out.println();
     for (int i = 1; i <= 5; i++)
     {
         for (int j = 1; j <= i; j++)
         {
             System.out.print(j % 2 + " ");
         }

         System.out.println();
     }
}
}
/*

    1
   121
  12321
 1234321
123454321
1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1
*/