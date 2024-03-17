package LoopingPro_20_10_21;

public class DecreaseStar {
	public static void main(String[] args) {
		for(int row=5;row>=1;row--)
		{
			for(int col=1;col<row;col++)
			{
				System.out.print(col);
			}
			for(int col=1;col<=5;col++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
