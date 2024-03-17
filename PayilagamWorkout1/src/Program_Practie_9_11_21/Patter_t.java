package Program_Practie_9_11_21;

public class Patter_t {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=0;j<5;j++)
		{
			System.out.print((i*j)%2+" ");
		}
		System.out.println();
	}
}
}
/*
0 1 0 1 0 
0 0 0 0 0 
0 1 0 1 0 
0 0 0 0 0 
0 1 0 1 0 

*/