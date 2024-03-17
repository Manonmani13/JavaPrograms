package Pattern_programs19_10_21;

public class Pro2 {
/*
 * 1
 * 2 4 
 * 3 6 9
 * 4 8 12 16
 * 5 10 15 20 25
 */
	public static void main(String[] args) {
	
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col*row+" ");
				
			}
			
			System.out.println();
		}
		/*for(int col=1;col<=1;col++)
		{
			System.out.print(col+" ");
		}
		System.out.println();
		for(int col=2;col<=4;col+=2)
		{
			System.out.print(col+" ");
		}
		System.out.println();
		for(int col=3;col<=9;col+=3)
		{
			System.out.print(col+" ");
		}
		System.out.println();
		for(int col=4;col<=16;col+=4)
		{
			System.out.print(col+" ");
		}
		System.out.println();
		for(int col=5;col<=25;col+=5)
		{
			System.out.print(col+" ");
		}
		System.out.println();*/
	}
}
