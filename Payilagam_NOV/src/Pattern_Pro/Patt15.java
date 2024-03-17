package Pattern_Pro;

public class Patt15 {
public static void main(String[] args) {
	 int a=1;
     
	    for(int j = 1;j<=5;j++)
	    {
	        for(int i = 1; i<=j; i++)
	        {               
	            System.out.print((a++) + " ");
	        }
	        System.out.println();
	    }
}
}
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/