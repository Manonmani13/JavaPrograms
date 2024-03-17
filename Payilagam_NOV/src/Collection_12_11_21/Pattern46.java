package Collection_12_11_21;

public class Pattern46 {
public static void main(String[] args) {
	int k=2;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(k+" ");
			k=k+2;
		}
		System.out.println();
	}
}
}
/*2 
4 6 
8 10 12 
14 16 18 20 
22 24 26 28 30 
*/
