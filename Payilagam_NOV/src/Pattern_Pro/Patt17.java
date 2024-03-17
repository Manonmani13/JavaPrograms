package Pattern_Pro;

public class Patt17 {
public static void main(String[] args) {
	System.out.println();
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 5; j > i; j--)
        {
            System.out.print(" ");
        }

        int temp = 1;
        for (int k = 1; k <= i; k++)
        {
            System.out.print(temp + " ");
            temp = temp * (i - k) / (k);
        }
        System.out.println();
    }
}
}
/*

    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 

*/