package Pattern_Pro;

public class Patt13 {
public static void main(String[] args) {
	for (int j = 6; j >= 1; j--)
    {
        for (int i = j; i >= 1; i--) 
        {
            System.out.print(" " + " ");
 
        }
 
        for (int i = 6; i >= j; i--) 
        {
            System.out.print(i + " ");
 
        }
        for (int i = 10; i >= j; i--) 
        {
            System.out.print(" " + " ");
 
        }
        for (int i = 1; i <= j; i++)
        {
            System.out.print(" " + " ");
        }
        System.out.println();
    }
 
    for (int j = 1; j <= 6; j++)
    {
        for (int i = 1; i <= j; i++)
        {
            System.out.print(" " + " ");
 
        }
 
        for (int i = 6; i >= j; i--)
        {
            System.out.print(i + " ");
 
        }
        for (int i = 6; i >= j; i--) 
        {
            System.out.print(" " + " ");
        }
        for (int i = 1; i <= j; i++) 
        {
            System.out.print(" " + " ");
        }
 
        System.out.println();
    }
}
}
/*
            6                       
          6 5                       
        6 5 4                       
      6 5 4 3                       
    6 5 4 3 2                       
  6 5 4 3 2 1                       
  6 5 4 3 2 1               
    6 5 4 3 2               
      6 5 4 3               
        6 5 4               
          6 5               
            6               

*/