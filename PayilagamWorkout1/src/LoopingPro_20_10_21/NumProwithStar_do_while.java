package LoopingPro_20_10_21;

public class NumProwithStar_do_while {
	public static void main(String[] args) {
		int row=5;
		do
		{
			int col=1;
			do
			{
				System.out.print(col);
				col++;
			}while(col<=row);
			int col1=1;
			do
			{
			System.out.print("*");
			col1++;
			}while(col1<=5);
			System.out.println();
			row--;
		}while(row>=1);
	}
}
