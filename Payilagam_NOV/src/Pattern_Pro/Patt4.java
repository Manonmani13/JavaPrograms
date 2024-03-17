package Pattern_Pro;

public class Patt4 {
public static void main(String[] args) {
    
    for(int j=1;j<=6;j++)
    {
    for(int i =1;i<=j;i++)
    {
        System.out.print(i+" ");
         
    }
    for(int  i =j-1;i>=1;i--)
    {
        System.out.print(i+" ");
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
1 2 3 4 5 6 5 4 3 2 1 

*/