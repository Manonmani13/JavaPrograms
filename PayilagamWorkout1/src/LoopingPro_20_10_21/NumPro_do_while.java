package LoopingPro_20_10_21;

public class NumPro_do_while {
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
			row--;
			System.out.println();
		}while(row>=1);
	}
}
