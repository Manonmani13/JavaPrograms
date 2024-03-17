package Pattern_Pro;

public class Patt12 {
public static void main(String[] args) {
	for (int j = 1; j <= 6; j++)
    {
        for (int i = j; i <= 6; i++) 
        {
            if (i == 6) 
            {
                System.out.print(i);
            } else
                System.out.print(" " + " ");
        }
        for (int i = 1; i <= j; i++) 
        {
            System.out.print(" " + " ");
        }
        for (int i = 1; i <= j; i++) 
        {
            System.out.print(" " + " ");
        }
        for (int i = 6; i >= j; i--) 
        {
            if (i == 6) 
            {
                System.out.print(i);
            } else
                System.out.print(" " + " ");
        }
        for (int i = j; i <= 6; i++) 
        {
            if (i == 6) 
            {
                System.out.print(i);
 
            } else
                System.out.print(" " +" ");
        }
        for (int i = 1; i <= j; i++) 
        {
            System.out.print(" "+" " );
        }
        for (int i = 1; i <= j; i++) 
        {
 
            System.out.print(" " +" " );
        }
        for (int i = 6; i >= j; i--) 
        {
            if (i == 6)
            {
                System.out.print(i);
            } else
                System.out.print(" " +" ");
        }
        System.out.println();
    }
}
}
/*
          6    6                    6    6          
        6        6                6        6        
      6            6            6            6      
    6                6        6                6    
  6                    6    6                    6  
6                        66                        6


*/