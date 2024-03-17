package Programs_11_11_21;

public class Patter43 {
public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
		int k=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");k=k+2;
				
			}
			System.out.println();
		}
	}
}
/*
1 
1 3 
1 3 5 
1 3 5 7 
1 3 5 7 9 

*/