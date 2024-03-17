package String_method_29_10_21;

public class Patter_21 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++)
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