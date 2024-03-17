package LoopingPro_20_10_21;

public class RowStars_while {
	public static void main(String[] args) {
		int row=5;
		while(row>=1)
		{
			int col=1;
		while(col<row)
			{
				System.out.print(col);
				col++;
			}
		int col1=1;
			while(col1<=6-row)
			{
			System.out.print("*");
			col1++;
			}
			row--;
			System.out.println();
		}
	}
}
