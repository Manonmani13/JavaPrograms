package LoopingPro_20_10_21;

public class RowCen_while {
	public static void main(String[] args) {
		int row=1;
		while(row<=5)
		{
			int col=1;
			while(col<=row)
			{
				System.out.print(" "+" ");
				col++;
			}
			int col1=1;
			while(col1<=6-row)
			{
			System.out.print(" "+row+" ");
			col1++;
			}
			System.out.println();
			;row++;
		}
	}
}
