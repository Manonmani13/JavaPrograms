package Programs_11_11_21;

public class Pattern40 {
public static void main(String[] args) {
	for(int i=5;i>=1;i--)
	{
	
		for(int j=1;j<=i;j++)
		{
			System.out.print(j*2+ " ");
		}
		System.out.println();
	}
}
}
/*
2 4 6 8 10 
2 4 6 8 
2 4 6 
2 4 
2 
*/