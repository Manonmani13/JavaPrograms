package BasicPrograms_10_11_21;

public class Patter_33 {
public static void main(String[] args) {
	int n=5,x;
	for(int i=5;i>0;i--)
	{
		x=i;
		for(int j=5;j>0;j--)
		{
			x=x+n;
			System.out.print((char)(x-n+65)+" ");
		}
		System.out.println();
	}
}
}
/*
 * F K P U Z 
E J O T Y 
D I N S X 
C H M R W 
B G L Q V 
 */
