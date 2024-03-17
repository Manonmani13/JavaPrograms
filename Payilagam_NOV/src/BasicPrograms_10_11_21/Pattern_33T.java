package BasicPrograms_10_11_21;

public class Pattern_33T {
	public static void main(String[] args) {
		int n=5,x;
		for(int i=1;i<=n;i++)
		{
			x=n-i;
			for(int j=1;j<=n;j++)//1<5 2<5
			{
				System.out.print((char)(x+65)+" ");//69 74 
			x=x+n;//9
			}
			System.out.println();
		}
	}
}
/*
E J O T Y 
D I N S X 
C H M R W 
B G L Q V 
A F K P U 

*/