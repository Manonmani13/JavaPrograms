package BasicPrograms_10_11_21;

public class Pattern_32T {
public static void main(String[] args) {
	int n=5,x;
	for(int i=0;i<5;i++)
	{
		x=i;
		for(int j=0;j<5;j++)
		{
			x+=n;
			System.out.print((char)(x-n+65)+" ");
		}
		System.out.println();
	}
}
}
/*
A F K P U 
B G L Q V 
C H M R W 
D I N S X 
E J O T Y 

*/