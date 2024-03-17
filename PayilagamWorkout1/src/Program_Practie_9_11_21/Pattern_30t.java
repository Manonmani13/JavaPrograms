package Program_Practie_9_11_21;

public class Pattern_30t {
	public static void main(String[] args) {
		int k=65;
		for(int i=0;i<5;i++)
		{
			
			for(int j=0;j<5;j++)
			{
				System.out.print((char)(j+k)+" ");
				k++;
			}
			System.out.println();
			
		}
	}
}
/*
A C E G I 
F H J L N 
K M O Q S 
P R T V X 
U W Y [ ] 

*/