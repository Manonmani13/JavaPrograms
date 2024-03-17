package Programs_11_11_21;

public class Pattern44_1 {
	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=4;i++)
		{
			 k+=i;
			for(int j=k;j>k-i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*
1 
3 2 
6 5 4 
10 9 8 7 

*/