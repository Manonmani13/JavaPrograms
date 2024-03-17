package Programs_11_11_21;

public class Patter42T2 {
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
		
			for(int j=0;j<=i;j++)
			{
				System.out.print(i+j-i+" ");
				
			}
			System.out.println();
		}
	}
}
/*
0 
0 1 
0 1 2 
0 1 2 3 
0 1 2 3 4 

*/