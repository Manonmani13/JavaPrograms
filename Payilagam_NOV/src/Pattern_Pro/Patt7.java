package Pattern_Pro;

public class Patt7 {
public static void main(String[] args) {
	 
    for(int j =1;j<=5;j++)
    {
        for(int i =5;i>=j;i--)
        {
            System.out.print(i+" ");
        }
    System.out.println();
    }
    for(int k =5;k>=1;k--)
    {
     
    for(int i =5;i>=k;i--)
    {
        System.out.print(i+" ");
    }
    System.out.println();
    }
}
}
/*
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 

*/