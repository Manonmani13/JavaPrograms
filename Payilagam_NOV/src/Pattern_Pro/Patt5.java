package Pattern_Pro;

public class Patt5 {
public static void main(String[] args) {
	for(int j =1;j<=7;j++)
    {
    for(int i =1;i<=j;i++)
    {
        System.out.print(i+" ");
    }
    for(int i =1;i<=7-j;i++)
    {
        System.out.print(i+" ");
    }
    System.out.println();
}
}
}
/*
1 1 2 3 4 5 6 
1 2 1 2 3 4 5 
1 2 3 1 2 3 4 
1 2 3 4 1 2 3 
1 2 3 4 5 1 2 
1 2 3 4 5 6 1 
1 2 3 4 5 6 7 

*/