package LoopingPro_20_10_21;

public class RowPro_do_while {
	public static void main(String[] args) {
		int row=5;
		do
		{
			int col=1;
			do
			{
				System.out.print(" "+" ");
				;col++;
			}while(col<=row);
			int col1=1;
			do
			{
			System.out.print(" "+row+" "+" ");
			;col1++;
			}while(col1<=6-row);
			System.out.println();
			;row--;
		}while(row>=1);
	}
}
