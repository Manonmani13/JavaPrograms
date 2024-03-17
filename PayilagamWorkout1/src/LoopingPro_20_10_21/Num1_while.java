package LoopingPro_20_10_21;

public class Num1_while {
	public static void main(String[] args) {
		int row=5;
		while(row>=1)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col);
			}
			System.out.println("*");
			System.out.println();
			row--;
		}
	}
}
