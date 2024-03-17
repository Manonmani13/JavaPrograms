package Programs_11_11_21;

public class Patter42T {
	public static void main(String[] args) {
		int k=1;
		for(int i=0;i<5;i++)
		{
		
			for(int j=0;j<=i;j++)
			{
				System.out.print(k+j+" ");
				k++;
			}
			System.out.println();
		}
	}
}
/*
1 
2 4 
4 6 8 
7 9 11 13 
11 13 15 17 19 

*/