package Pattern_Pro;

public class Patt9 {
public static void main(String[] args) {
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
        for (int i = j; i <= 6; i++) 
        {
            System.out.print(i + " ");
        }
        for (int i = 1; i <= j; i++) 
        {
            System.out.print(" " + " ");
        }
        System.out.println();
 
    }
 
    for (int k = 6; k >= 1; k--)
    {
        for (int i = 1; i <= k; i++) 
        {
            System.out.print(" " + " ");
        }
 
        for (int i = 6; i >= k; i--) 
        {
 
            System.out.print(i + " ");
        }
        for (int i = k; i <= 6; i++)
        {
            System.out.print(i + " ");
        }
        for (int i = 1; i <= k; i++) 
        {
            System.out.print("" + " ");
        }
 
        System.out.println();
 
    }
}
}
/*
  6 5 4 3 2 1 1 2 3 4 5 6   
    6 5 4 3 2 2 3 4 5 6     
      6 5 4 3 3 4 5 6       
        6 5 4 4 5 6         
          6 5 5 6           
            6 6             
            6 6       
          6 5 5 6      
        6 5 4 4 5 6     
      6 5 4 3 3 4 5 6    
    6 5 4 3 2 2 3 4 5 6   
  6 5 4 3 2 1 1 2 3 4 5 6  


*/