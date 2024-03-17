package Pattern_Pro;

public class Patt3 {
public static void main(String[] args) {

    for(int j = 6;j>=1;j--)
    {
        for(int i = 1; i<j; i++)
        {
            System.out.print(" "+" ");
        }
         
         
          for(int i = 1; i<=7-j; i++)
          { 
              System.out.print(7-j + "   ");
           
          }
          
        System.out.println();
         
    }
}
}
/*
          1   
        2   2   
      3   3   3   
    4   4   4   4   
  5   5   5   5   5   
6   6   6   6   6   6   

*/