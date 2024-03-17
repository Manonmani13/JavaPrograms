package Pattern_Pro;

public class Patt22 {
public static void main(String[] args) {
	System.out.println();
    int temp = 1;
    for(int i=1; i<=5/2+1; i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(temp*j+" ");
        }
        System.out.println();
        temp++;
    }
    for(int i=1; i<=5/2; i++)
    {
        for(int j=1;j<=5/2+1-i;j++)
        {
            System.out.print(temp*j+" ");
        }
        System.out.println();
        temp++;
    }
    System.out.println();
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            if (j % 2 == 0)
                System.out.print((5 * (j)) + i + 1 + " ");
            else
                System.out.print((5 * (j + 1)) - i + " ");
        }
        System.out.print("\n");
    }
}
}
/*

1 
2 4 
3 6 9 
4 8 
5 
1 10 11 20 21 
2 9 12 19 22 
3 8 13 18 23 
4 7 14 17 24 
5 6 15 16 25
*/