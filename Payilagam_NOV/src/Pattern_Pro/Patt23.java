package Pattern_Pro;

public class Patt23 {
public static void main(String[] args) {
	System.out.println();
    for (int i = 5; i >= 1; i--)
       {
           for (int j = 5 ; j >= i; j--)
           {
               System.out.print(j + " ");
               int temp =j;
           }
           for (int k = 5 - i+1; k < 5; k++)
           {
               System.out.print(5 + " ");
           }
           System.out.println();
       }
    System.out.println();
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            System.out.print(j);
        }
         
        for (int j= i*2 ; j < 5*2; j++) 
        { 
            System.out.print(" "); 
        } 
        for (int l = i; l >= 1; l--)
        {
            System.out.print(l);
        }
        System.out.println();
    }
}
}
/*

5 5 5 5 5 
5 4 5 5 5 
5 4 3 5 5 
5 4 3 2 5 
5 4 3 2 1 

1        1
12      21
123    321
1234  4321
1234554321

*/