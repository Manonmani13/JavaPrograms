package Program_Practie_9_11_21;

public class Patter_T3 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++) {
			System.out.print(j+i%2+" ");
		}
		System.out.println();
	}
}
}
/*
2 3 4 5 6 
1 2 3 4 5 
2 3 4 5 6 
1 2 3 4 5 
2 3 4 5 6 

*/